// --------------------------------
// Bloco 2, Ex. 7
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

// Operations can't be defined in a separate rule because that would
// mean indirect left-recursive situation, which is infinite
// and not solved by ANTLR4


grammar SetCalculator;

// Parser Rules
program   : line * EOF;

line      : expr;

expr      : '(' expr ')'                #Expr_Parentesis
          | expr '\\' expr              #Expr_Diference
          | expr '&'  expr              #Expr_Intersection
          | expr '+'  expr              #Expr_Union
          | set                         #Expr_Set
          | assignment                  #Expr_Assignment
          | ID                          #Expr_Variable
          ;

assignment: ID '=' expr
          ;

set       : '{' (NUM  (',' NUM )*  )? '}'
          | '{' (WORD (',' WORD)* )? '}'
          ;

// Lexer Rules
NUM       : ('-'|'+')? [0-9]+;
WORD      : [a-z]+;
ID        : [A-Z]+;
COMMENTS  : '--' .*? '\n' -> skip;
//NEWLINE   : '\r'? '\n';
WS        : [ \t\r\n]+ -> skip;
ERROR : . ; // to convert all lexer errors into parser errors
