import java.util.Scanner;
import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * Example of Practical Test
 * Formal And Automated Languages
 * @author Pedro Teixeira, 84715, MIECT
 */
public class TextGrammarMain {
   public static void main(String[] args) throws Exception {
      for (String fileName : args) {    
        File file = new File(fileName);

        // Verify file sanity
        if (!file.exists()) {
            System.err.println("ERROR : File \"" + fileName + "\" not found!");
            System.exit(2);
        }

        if (!file.canRead()) {
            System.err.println("ERROR : File \"" + fileName + "\" can't be read!");
            System.exit(2);
        }

         if (file.isDirectory()) {
            System.err.println("ERROR : File \"" + fileName + "\" is a directory");
            System.exit(2);
        }

        Scanner sc = new Scanner(file);
        String lineText = null;
        int lineNum = 1;
        if (sc.hasNextLine())
            lineText = sc.nextLine();
        TextGrammarParser parser = new TextGrammarParser(null);
        // replace error listener:
        //parser.removeErrorListeners(); // remove ConsoleErrorListener
        //parser.addErrorListener(new ErrorHandlingListener());
        TextInterpreter visitor0 = new TextInterpreter();
        while(lineText != null) {
            // create a CharStream that reads from standard input:
            CharStream input = CharStreams.fromString(lineText + "\n");
            // create a lexer that feeds off of input CharStream:
            TextGrammarLexer lexer = new TextGrammarLexer(input);
            lexer.setLine(lineNum);
            lexer.setCharPositionInLine(0);
            // create a buffer of tokens pulled from the lexer:
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // create a parser that feeds off the tokens buffer:
            parser.setInputStream(tokens);
            // begin parsing at main rule:
            ParseTree tree = parser.main();
            if (parser.getNumberOfSyntaxErrors() == 0) {
                // print LISP-style tree:
                // System.out.println(tree.toStringTree(parser));
                visitor0.visit(tree);
            }
            if (sc.hasNextLine())
                lineText = sc.nextLine();
            else
                lineText = null;
            lineNum++;
        }
      }
   }
}
