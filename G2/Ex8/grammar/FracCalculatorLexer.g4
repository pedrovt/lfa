// --------------------------------
// Bloco 2, Ex. 8
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

lexer grammar FracCalculatorLexer;

@header {
package grammar;	
}

// Reserved Words
PRINT		: 'print';
REDUCE		: 'reduce';
POWER		: '^' INT;		// solves priority issues
FRAC		: INT ('/' INT)?;

// Numbers and IDs
INT 		: ('-'|'+')? [0-9]+;
ID			: [a-z]+;

// Operations
DIVIDE		: ':';			
MULTIPLY	: '*';
ADD			: '+';
SUBTRACT	: '-';

// Other Stuff
ARROW		: '->';	
SEMICOLON	: ';';
LPARENTESIS	: '(';
RPARENTESIS	: ')';

// Comments & Space
COMMENTS	: '//' .*? '\n' -> skip;
WS			: [ \t\r\n]+ 	-> skip;
ERROR		: .;