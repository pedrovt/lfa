// --------------------------------
// Bloco 3, Ex. 1
// TableProcessorLexer
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

lexer grammar TableProcessorLexer;

@header {
// --------------------------------
// Bloco 3, Ex. 1
// TableProcessorLexer
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

package grammar;
}

// Reserved Words (SQL Style)
READ		: 'READ'	;
PRINT 		: 'PRINT'	;
WRITE		: 'WRITE'	;
JOIN		: 'JOIN'	;
SELECT		: 'SELECT'	;
FROM		: 'FROM'	;
ADD			: 'ADD'		;
SUBTRACT	: 'SUBTRACT';
MULTIPLY	: 'MULTIPLY';
DIVIDE		: 'DIVIDE'	;
SAVEALL		: 'SAVE ALL';
RESTOREALL	: 'RESTORE ALL';

// Reserved Symbols
ARROW		: '->';

// IDs, INTs & File Names
INT			: [0-9]+;
C_FILE_NAME	: ([a-zA-Z] | [0-9] | '_')+ '.csv';
ID			: [a-zA-Z] ([a-zA-Z] | [0-9] | '_')*;
FILE_NAME	: ([a-zA-Z] | [0-9] | '_' | '.')+;

// Comments (Java-like comments) & White-Space
LINE_COMMENT	: '//' .*? '\n' -> skip;
COMMENT			: '/*' .*? '*/' -> skip;
WS				: [ \t\n\r]+ 	-> skip;
ERROR			: .;
