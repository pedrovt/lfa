/**
 * Example of Practical Test
 * Formal And Automated Languages
 * @author Pedro Teixeira, 84715, MIECT
 */
 
grammar TextGrammar;

// -----------------------------------------------------------------------------
// Parser
main     : stat* EOF
         ;

stat     : print                
         | assign
         ;

print    : PRINT text;

assign   : ID COLON text; 

text     : input                                    #TextInput
         | text PLUS text                           #TextConcat
         | text BACKSLASH text BACKSLASH text       #TextReplace
         | OPEN_PAR  text CLOSE_PAR                 #TextParenthesis
         | ID                                       #TextID
         | STRING                                   #TextSTRING
         ;

input    : INPUT OPEN_PAR STRING CLOSE_PAR
         ;

// -----------------------------------------------------------------------------
// Lexer
INPUT    : 'input';
PRINT    : 'print';

OPEN_PAR : '(';
CLOSE_PAR: ')';
COLON    : ':';
PLUS     : '+';
BACKSLASH: '/';

STRING   :  '"' (ESC | . )*? '"';
ESC      : '\\"' | '\\\\' ;

ID       : [a-zA-Z][0-9A-Za-z]*;

COMMENTS : '//' .*? '\n' -> skip; 
WS       : [ \t\n\r]+    -> skip;
