// --------------------------------
// Bloco 2, Ex. 4
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

// With support for comments started by "--" (not asked in the exercise)

// Declaration of the Grammar
grammar Calculator;

// JAVA code
@header {
  import java.util.Map;
  import java.util.HashMap;
}

@members {
  private static Map<String, Double> symbolTable = new HashMap<>();
}

// Parser Language Rules
program:
        (COMMENTS* stat COMMENTS*)* EOF;      // A Calculator program has 0 or more statements before End-Of-File

stat:                                         // Statement has one expression and a NEWLINE
        assignment NEWLINE                    // WARNING: assignment should appear first
        {
          System.out.println("Value is " + $assignment.result);
        }
        |
        expr NEWLINE
        {
          System.out.println("Value is " + $expr.result);
        }
        |
        NEWLINE;

assignment
        returns [double result]:

        ID '=' expr
        {
          String variableName = $ID.text;

          // Debug messages
          if (symbolTable.containsKey(variableName)) System.err.print("Updated");
          else System.err.print("Added");

          // Update the symbol table and the return variable
          $result = $expr.result;
          symbolTable.put(variableName, $expr.result);

          // Debug message
          System.err.println(" variable " + variableName + " with value " + symbolTable.get(variableName) + " to the symbol table");
        };

expr                                          // Expression is an operation between expressions or an INT
        returns [double result]:

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
        |

        // IMPORTANT: if a variable is given, get the variable value
        ID
        {
          String variableName = $ID.text;
          if(!symbolTable.containsKey(variableName)) {
            System.err.println("ERROR: Variable " + variableName + " not found.");
            System.exit(1);
          }
          $result = symbolTable.get($ID.text);
        }
        ;

// Lexer Language Rules
ID      : [a-zA-Z_]+;
INT     : [0-9]+;
SPACES  : [ \t]+ -> skip;               // skip spaces
NEWLINE : '\r'? '\n';
COMMENTS: '-- ' .*? NEWLINE             // skip comments
         {                              // action for debugging purposes
           System.out.println("Skipped comment: " + COMMENTS);
         };
