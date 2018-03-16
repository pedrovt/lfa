// --------------------------------
// Bloco 2, Ex. 3
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

// Declaration of the Grammar
grammar Tradutor;

// Parser Rules
program:
          line* EOF;

line:
          NUMBER '-' WORD NEWLINE;

// Lexer Rules
WORD: [A-Za-z]+;
NUMBER: [0-9]+;
NEWLINE: '\r'? '\n';
WHITE_SPACES: [ \t]+ -> skip;
