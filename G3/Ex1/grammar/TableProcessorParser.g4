// --------------------------------
// Bloco 3, Ex. 1
// TableProcessorParser
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

parser grammar TableProcessorParser;

options {
	tokenVocab = TableProcessorLexer;
}

@header {
// --------------------------------
// Bloco 3, Ex. 1
// TableProcessorParser
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

package grammar;
}

program	: (instr)* EOF;

instr	: (save | assign | read | print | write | join | select | oper);

save	: SAVEALL FILE_NAME;

restore	: RESTOREALL FILE_NAME;

assign	: ID ARROW table;					// Variable Assignment

read	: READ  C_FILE_NAME;				// Read from file

print	: PRINT table;						// Print to Screen

write 	: WRITE table FILE_NAME;			// Write to File

join	: JOIN  table table;				// Join 

select	: SELECT INT FROM table 			// Select Column
		| SELECT ID	 FROM table
		;

oper	: (DIVIDE | MULTIPLY) table table	#OperDivideMultiply
		| (ADD	  | SUBTRACT) table table	#OperAddSubtract
		; 

table	: read								#TableRead
		| join								#TableJoin
		| select							#TableSelect
		| oper								#TableOper
		| ID								#TableVariable
		;
		
		