// --------------------------------
// CSVParser
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

parser grammar CSVParser;
options {
	tokenVocab = CSVLexer;
}

@header {
// --------------------------------
// CSVParser
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

package utils.csv.grammar;
}

file 	 : header row* EOF;

header	 : row;

row   	 : FIELD (COMMA FIELD)* EOL;