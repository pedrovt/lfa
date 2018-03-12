// --------------------------------
// Bloco 2, Ex. 1
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

// Based on the given example, with changes

grammar Hello;                                                     // Define a grammar called Hello

// Parser Language Rules
top : (greetings | bye)* EOF;                                       // a), e)
greetings : 'hello' ids {System.out.println("Olá " + $ids.list);};  // match keyword hello followed by an ID
bye : 'bye' ids {System.out.println("Adeus " + $ids.list);};        // c)
ids returns[String list=""] : ( ID {$list = $list + ($list.isEmpty() ? "" : ",") + $ID.text;})+;
// Lexer Language Rules
ID : [a-zA-Z]+ ;                                                   // match lower−case identifiers
WS : [ \t\r\n]+ -> skip ;                                          // skip spaces, \t, \n, \r (Windows)
