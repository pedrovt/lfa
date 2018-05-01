// --------------------------------
// CSVLexer
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

lexer grammar CSVLexer;

@header {
// --------------------------------
// CSVLexer
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

package utils.csv.grammar;
}

// Reserved Symbols
COMMA			: ',';

// Elements of the table
FIELD			: TEXT | TEXT_BETWEEN_QUOTE_MARKS;
fragment TEXT	: ~[,\n\r"]+;
fragment TEXT_BETWEEN_QUOTE_MARKS			
				: TEXT* '"' ( '""' | ~'"' )* '"' TEXT* ;

// No Comments. CSV does not define comments
EOL				: '\r'? '\n';
WS				: [ \t\n\r]+ 	-> skip;
ERROR			: .;
