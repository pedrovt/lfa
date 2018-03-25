import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class SetCalculatorMain {
	public static void main(String[] args) throws Exception {
		// create a CharStream that reads from standard input:
		CharStream input = CharStreams.fromStream(System.in);
		// create a lexer that feeds off of input CharStream:
		SetCalculatorLexer lexer = new SetCalculatorLexer(input);
		// create a buffer of tokens pulled from the lexer:
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer:
		SetCalculatorParser parser = new SetCalculatorParser(tokens);
		// replace error listener:
		//parser.removeErrorListeners(); // remove ConsoleErrorListener
		//parser.addErrorListener(new ErrorHandlingListener());
		// begin parsing at program rule:
		ParseTree tree = parser.program();
		if (parser.getNumberOfSyntaxErrors() == 0) {
			// print LISP-style tree:
			// System.out.println(tree.toStringTree(parser));
			SetCalculatorInterpreter visitor0 = new SetCalculatorInterpreter();
			visitor0.visit(tree);
		}
	}
}
