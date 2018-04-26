// --------------------------------
// Bloco 2, Ex. 8
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

parser grammar FracCalculatorParser;
options {
	tokenVocab = FracCalculatorLexer;
}

@header {
package grammar;	
}

program: (stat SEMICOLON)* EOF;

stat   : print		
	   | assign	
       ;

assign : expr ARROW ID	
	   ;
	   
print  : PRINT expr 
	   ;
	   
expr   : expr op=(DIVIDE | MULTIPLY) expr	#ExprDivisionMultiply
	   | expr op=(ADD    | SUBTRACT) expr	#ExprAddDifference
	   | expr POWER							#ExprPower
	   | REDUCE expr						#ExprReduce
	   | LPARENTESIS expr RPARENTESIS	    #ExprParentesis
	   | FRAC								#ExprFrac   
	   | ID							        #ExprVariable
	   
	   ;
