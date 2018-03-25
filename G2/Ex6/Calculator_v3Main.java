import java.util.Scanner;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Calculator_v3Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String lineText = null;
		int lineNum = 1;
		if (sc.hasNextLine())
			lineText = sc.nextLine();
		Calculator_v3Parser parser = new Calculator_v3Parser(null);
		// replace error listener:
		//parser.removeErrorListeners(); // remove ConsoleErrorListener
		//parser.addErrorListener(new ErrorHandlingListener());
		ConvertToSuffixExpr visitor0 = new ConvertToSuffixExpr();
		while(lineText != null) {
			// create a CharStream that reads from standard input:
			CharStream input = CharStreams.fromString(lineText + "\n");
			// create a lexer that feeds off of input CharStream:
			Calculator_v3Lexer lexer = new Calculator_v3Lexer(input);
			lexer.setLine(lineNum);
			lexer.setCharPositionInLine(0);
			// create a buffer of tokens pulled from the lexer:
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer:
			parser.setInputStream(tokens);
			// begin parsing at program rule:
			ParseTree tree = parser.program();
			if (parser.getNumberOfSyntaxErrors() == 0) {
				// print LISP-style tree:
				// System.out.println(tree.toStringTree(parser));
				System.out.println(visitor0.visit(tree));
			}
			if (sc.hasNextLine())
				lineText = sc.nextLine();
			else
				lineText = null;
			lineNum++;
		}
	}
}
