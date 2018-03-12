// --------------------------------
// Bloco 2, Ex. 2
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

// With support for comments started by "--" (not asked in the exercise)

// Declaration of the Grammar
grammar Calculator;

// Parser Language Rules
program:
        COMMENTS* stat* COMMENTS* EOF;        // A Calculator program has 0 or more statements before End-Of-File

stat:                                         // Statement has one expression and a NEWLINE
        expr NEWLINE
        {
          System.out.println("Value is " + $expr.result);
        }
        |
        NEWLINE;
expr                                          // Expression is an operation between expressions or an INT
        returns [double result = 0]:

        /* Order defines operations priority.
         * op1, op2 and op are variables to use in the JAVA code and
         * store the operands 1 and 2 and the operator, respectively */

        // op1 * op2 or op1 / op2
        op1=expr op=('*'|'/') op2=expr
        {
            if ($op.text.equals("*")) $result = $op1.result * $op2.result;
            else                    $result = $op1.result / $op2.result;
        }
        |

        // op1 + op2 or op1 - op2
        op1=expr op=('+'|'-') op2=expr
        {
            if ($op.text.equals("+")) $result = $op1.result + $op2.result;
            else                    $result = $op1.result - $op2.result;
        }
        |

        // Integer value
        INT
        {
            $result = Double.parseDouble($INT.text);
        }
        |

        // ( expression )
        '(' expr ')'
        {
            $result = $expr.result;
        }
        ;

// Lexer Language Rules
INT     : [0-9]+;
NEWLINE : '\r'? '\n';
SPACES  : [ \t]+ -> skip;               // skip spaces
COMMENTS: '-- ' .*? NEWLINE             // skip comments
         {                              // action for debugging purposes
           System.out.println("Skipped comment: " + COMMENTS);
         };
