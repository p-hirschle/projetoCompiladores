# Projeto de Compiladores, para o período de 2022.2

## DESCRIÇÃO
O projeto se trata de uma linguagem de domínio específico (DSL) responsável por validar a criação de classes do tipo Model no Django.                              
Uma classe do tipo Model possui campos específicos que, caso não sejam preenchidos de forma correta, impossibilitam a criação daquela classe.                       

## TECNOLOGIAS
ANTLR e Python.

## COMO UTILIZAR
#### **1.** Clone o repositório, e obtenha as depêndencias do arquivo 'requirements.txt' instaladas para evitar quaisquer erros.       
       *Isso pode ser feito com a execução do comando $pip freeze -r requirements.txt  .*      
#### **2.** Para utilizar a DSL, basta escrever o código em um arquivo com o import de 'dslModel' e rodar normalmente o run validando as classes que você deseja criar, porém já    existe um exemplo estabelecido no repositório, sendo suficiente apenas executar o arquivo dslModel.py caso preferível.     
#### **3** Execute o arquivo desejado e valide a criação de sua classe Model.

## GRAMÁTICA
A gramática estabelecida está no arquivo 'gramatica.g4', seguindo as orientações dadas em sala de aula:        

--------------------------------------------------------------------------------------------------      
**STR:** [a-zA-Z][a-zA-Z0-9_]*;      
**EXC:** [ \t\r\n]+ -> skip;      
     
**LPAR:** '(';     
**RPAR:** ')';    
**PONT:** ':';    
**PONTVIRG:** ';';     
**VIRG:** ',';     
      
**model:** 'class' STR 'models.Model' '{' campo* '}';       
       
**campo:** STR PONT tipo param PONTVIRG;         
**tipo:** 'models.CharField'  | 'models.BooleanField' | 'models.IntegerField' | 'models.ForeignKey';       
**param:** LPAR NUM RPAR | LPAR STRING RPAR | LPAR 'max_length=' NUM VIRG 'verbose_name=' STRING RPAR;        

--------------------------------------------------------------------------------------------------
      
## GRUPO
#### Carlos Eduardo Cabral     
#### Lucas Tenório Ferraz     
#### Pedro Lucas Melo Hirschle      
