package utils.csv;

import static java.lang.System.err;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import utils.csv.grammar.CSVLexer;
import utils.csv.grammar.CSVParser;
import utils.csv.interpreter.CSVInterpreter;

/**
 * 
 * <b>CSVTable</b><p>
 * This class is Serializable.<p>
 * @see Serializable
 * Formal and Automated Languages
 * @author Pedro Teixeira, 84715, MIECT
 */
public class CSVTable implements Serializable {

	private static final long serialVersionUID = 8729824960462290406L;

	// Instance Fields
	private Map<String, List<String>> table;

	// CTOR
	/**
	 * 
	 * Constructor. Exits the thread if the given path is not a valid path to a CSV table file or if 
	 * the table file has any syntax erros.
	 * @param filepath path to the CSV table file.
	 */
	@SuppressWarnings("resource")
	public CSVTable(String filepath) {
		// create a stream from the file
		InputStream file_stream = null;
		try {
			file_stream = new FileInputStream(new File(filepath)); 
		}
		catch(FileNotFoundException e) {
			err.println("ERROR: CSV table file not found!");
			System.exit(1);
		}

		// create a CharStream that reads from the file:		
		CharStream input = null;
		try {
			input = CharStreams.fromStream(file_stream);
			file_stream.close();
		} catch (IOException e) {
			err.println("ERROR: Internal error reading CSV table file!");
			System.exit(1);
		}

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
			table = visitor0.visit(tree);
		}

		else {
			err.println("ERROR: Invalid CSV Table File!");
			System.exit(2);
		}
	}

	// Getter
	/**
	 * @return the table
	 */
	public Map<String, List<String>> getTable() {
		return table;
	}

	// Other Methods
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CSVTable [");
		if (table != null) {
			builder.append("table=");
			builder.append(table);
		}
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((table == null) ? 0 : table.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CSVTable other = (CSVTable) obj;
		if (table == null) {
			if (other.table != null) {
				return false;
			}
		} else if (!table.equals(other.table)) {
			return false;
		}
		return true;
	}


}
