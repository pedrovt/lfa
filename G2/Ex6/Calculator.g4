// --------------------------------
// Bloco 2, Ex. 6
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

// With support for comments started by "--" (not asked in the exercise)
// Refactored so actions and attributes are not used
// The functionalities implemented by the actions are now implemented by visitors

// Utilizando a gramática definida no problema 2.4 e recorrendo aos visitors do ANTLR, converta
// uma expressão aritmética infixa (operador no meio dos operandos), numa expressão
// equivalente sufixa (operador no fim). Por exemplo:
// • 2 + 3 -> 2 3 +
// • 2 + 3 = 4 -> 2 3 4 = +
// • 3 * (2 + 1) + (2 − 1) -> 3 2 1 + * 2 1 − +

// Declaration of the Grammar
grammar Calculator;

// Parser Language Rules
program:
        (stat)* EOF;                            // A Calculator program has 0 or more statements before End-Of-File

stat:                                         // Statement has one expression and a NEWLINE
                                              // WARNING: assignment should appear first
        expr NEWLINE						              #ExprStat
        |
        assignment NEWLINE                    #AssignmentStat

        ;

assignment:
        ID '=' expr
        ;

expr:                                         // Expression is an operation between expressions or an INT
                                              // Order defines operations priority
        // op1 * op2 or op1 / op2
        expr ('*'|'/') expr                   #MULT_DIV
        |
        // op1 + op2 or op1 - op2
        expr ('+'|'-') expr                   #ADD_SUB
        |
        // Integer value
        INT                                   #NUM
        |
        // ( expression )
        '(' expr ')'                          #PARENTESIS_EXPR
        |
        // Variable
        ID                                    #VARIABLE
        ;

// Lexer Language Rules
ID      : [a-zA-Z_]+;
INT     : [0-9]+;
SPACES  : [ \t]+ -> skip;               // skip spaces
NEWLINE : '\r'? '\n';
//COMMENTS: '-- ' .*? NEWLINE -> skip;    // skip comments
