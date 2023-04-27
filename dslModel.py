
import ast, re
from django.db import models
#import DjangoModelLexer

#importando a ast (abstract syntax tree) como ferramenta de análise de código, utilizando os conceitos de nó
#importando o models do django pra validar a criação da classe Models (objetivo da dsl)


MODEL_CLASS_PATTERN = r"^class( )[A-Z][a-z]+\(models\.Model\):$"
                    # class Rede(models.Model):
MODEL_FIELD_PATTERN = r"^[a-z]+[_]*[a-z]+[_]*[a-z]+( )*=( )*models.CharField(\w=[0-9]+,( )*\w=\'[\w]\')$"
                    # nome_da_classe = models.CharField(max_length=50, verbose_name='Nome da Classe')


class DSLModel:
    def __init__(self):

        # a classe vai retornar um dicionário com o nome da classe e os campos definidos pelo Model (fields)
        self.nome_da_classe = None
        self.campos = {}


    # checagem de criação de classe em python e checagem se essa classe herda de models.Model
    def evaluate(self, codigo):
        modulo = ast.parse(codigo)
        # ast.parse splita o codigo em tokens baseados na gramática
        for no in modulo.body:
        # para cada nó de modulo ()
            
            if isinstance(no, ast.ClassDef):
                # checa a criação de uma classe python
                if no.bases:

                    # checa a herança de models.Model da classe
                    if isinstance(no.bases[0], ast.Attribute) and no.bases[0].attr == 'Model':

                        # caso a classe realmente herde, prossegue
                        self.nome_da_classe = no.name

                        # checagem dos campos na classe Model
                        for no_corpo in no.body:

                            if isinstance(no_corpo, ast.Assign):
                                if len(no_corpo.targets) != 1:
                                    raise ValueError('A definição do campo está incorreta.')
                                field_name = no_corpo.targets[0].id
                                if not isinstance(no_corpo.value, ast.Call):
                                    raise ValueError('A definição do campo está incorreta.')
                                field_args = {}
                                for keyword in no_corpo.value.keywords:
                                    if not isinstance(keyword.value, (ast.Str, ast.Num)):
                                        raise ValueError('A definição do campo está incorreta.')
                                    field_args[keyword.arg] = keyword.value.n if isinstance(keyword.value, ast.Num) else keyword.value.s
                                self.campos[field_name] = field_args
                break

        if self.nome_da_classe is None:
            raise ValueError('Nenhuma classe models.Model foi criada.')

        return {'nome_da_classe': self.nome_da_classe, 'campos': self.campos}

###################################### RUN ######################################
###################################### RUN ######################################
###################################### RUN ######################################

dsl = DSLModel()

# a criação dessa classe não é aceita na DSL por não herdar do Model
# vai disparar uma exception 
classeSemModel = """""
class SemModel():
     nome_da_classe = models.CharField(max_length=50, verbose_name='Nome da Classe')
"""""

try: 
    output3 = dsl.evaluate(classeSemModel)

except ValueError as excecao:
    print(f'\nDISPARO DE EXCEÇÃO: ')
    print(str(excecao))
    print(f'')
    
# define uma classe de Model com um campo "nome", um campo "ssid" e um campo "senha" 
classeRede = """""
class Rede(models.Model):
    nome = models.CharField(max_length=50, verbose_name='Nome da Rede')
    ssid = models.CharField(max_length=32, verbose_name='SSID')
    senha = models.CharField(max_length=16, verbose_name='Senha')
"""""
# rodando a DSL na classeRede
output = dsl.evaluate(classeRede)
print(output) 


# a criação dessa classe não é aceita na DSL por conter um campo de ForeignKey que não é tratado na DSL
# vai disparar uma exception de ValueError referente ao campo
classeDispositivo = """""
class Dispositivo(models.Model):
    mac = models.CharField(max_length=50, verbose_name='Nome da Rede')
    num_serie = models.CharField(max_length=32, verbose_name='SSID')
    rede_wifi = models.ForeignKey(Rede, on_delete=models.CASCADE)
"""""
try: 
    output2 = dsl.evaluate(classeDispositivo)
    print(output2)

except ValueError as excecao:
    print(f"\nDISPARO DE EXCEÇÃO: ")
    print(str(excecao))
    print(f'')



