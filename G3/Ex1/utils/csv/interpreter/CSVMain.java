package utils.csv.interpreter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import utils.csv.grammar.CSVLexer;
import utils.csv.grammar.CSVParser;

public class CSVMain {
	public static void main(String[] args) throws Exception {
		// create a CharStream that reads from standard input:
		CharStream input = CharStreams.fromStream(System.in);
		// create a lexer that feeds off of input CharStream:
		CSVLexer lexer = new CSVLexer(input);
		// create a buffer of tokens pulled from the lexer:
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer:
		CSVParser parser = new CSVParser(tokens);
		// replace error listener:
		//parser.removeErrorListeners(); // remove ConsoleErrorListener
		//parser.addErrorListener(new ErrorHandlingListener());
		// begin parsing at file rule:
		ParseTree tree = parser.file();
		if (parser.getNumberOfSyntaxErrors() == 0) {
			// print LISP-style tree:
			// System.out.println(tree.toStringTree(parser));
			CSVInterpreter visitor0 = new CSVInterpreter();
			visitor0.visit(tree);
		}
	}
}
