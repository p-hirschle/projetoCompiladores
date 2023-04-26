grammar DjangoModel;

NUM: [0-9]+;
STR: [a-zA-Z][a-zA-Z0-9_]*;
EXC: [ \t\r\n]+ -> skip;

LPAR: '(';
RPAR: ')';
PONT: ':';
PONTVIRG: ';';
VIRG: ',';



model: 'class' STR 'models.Model' '{' campo* '}';

campo: STR PONT tipo param PONTVIRG;
tipo: 'models.CharField'  | 'models.BooleanField' | 'models.IntegerField' | 'models.ForeignKey';
param: LPAR NUM RPAR | LPAR STRING RPAR | LPAR 'max_length=' NUM VIRG 'verbose_name=' STRING RPAR;









