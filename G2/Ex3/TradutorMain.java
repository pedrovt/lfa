import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.Map;

public class TradutorMain {
  public static void main(String[] args) throws Exception {
    // create a stream from the file
    InputStream file_stream = null;
    try {
      file_stream = new FileInputStream(new File("numbers.txt")); }
      catch(FileNotFoundException e) {
        err.println("ERROR: reading number file!");
        System.exit(1);
      }

      // create a CharStream that reads from file_stream:
      CharStream input = CharStreams.fromStream(file_stream);
      // create a lexer that feeds off of input CharStream:
      TradutorLexer lexer = new TradutorLexer(input);
      // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // create a parser that feeds off the tokens buffer:
      TradutorParser parser = new TradutorParser(tokens);
      // replace error listener:
      //parser.removeErrorListeners(); // remove ConsoleErrorListener
      //parser.addErrorListener(new ErrorHandlingListener());
      // begin parsing at program rule:
      ParseTree tree = parser.program();
      if (parser.getNumberOfSyntaxErrors() == 0) {
        // print LISP-style tree:
        // System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        BuildNumbersMapping listener0 = new BuildNumbersMapping();
        walker.walk(listener0, tree);

        // tests
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
          String line = in.nextLine();
          String[] words = line.replace('-',' ').toLowerCase().split(" ");
          for(int i = 0;i < words.length;i++) {
            if(i != 0) out.print(" ");
            if(listener0.exists(words[i]))
            out.print(listener0.getValue(words[i]).toString());
            else
            out.print(words[i]);
          }
          out.println();
        }
      }

    }
  }
