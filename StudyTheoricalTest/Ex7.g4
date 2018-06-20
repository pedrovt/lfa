grammar Ex7;

main: expr* EOF;

expr: '(' expr* ')'
	| expr ',' expr 
    | 'i' (',' 'i')?
    ;

WS: [ \t\r\n]+ -> skip;
