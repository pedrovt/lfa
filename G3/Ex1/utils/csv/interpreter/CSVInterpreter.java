package utils.csv.interpreter;

import static java.lang.System.err;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

import utils.csv.grammar.CSVParser.FileContext;
import utils.csv.grammar.CSVParser.HeaderContext;
import utils.csv.grammar.CSVParser.RowContext;
import utils.csv.grammar.CSVParserBaseVisitor;

/**
 * <b>CSVInterpreter</b><p>
 * Formal and Automated Languages
 * @author Pedro Teixeira, 84715, MIECT
 */
public class CSVInterpreter extends CSVParserBaseVisitor<Map<String, List<String>> > {

	// Instance Fields
	private Map<String, List<String>> tableByColumns = new LinkedHashMap<>();	// Access by Column (LinkedHashMap to keep the order in which columns are read from the header)
	private List<String> columnNames 		= new LinkedList<>();	
	private List<List<String>> tableByRows  = new LinkedList<>();		// Access by Row

	@Override
	public Map<String, List<String>> visitFile(FileContext ctx) {
		visit(ctx.header());
		ctx.row().forEach(row -> visit(row));

		System.out.println("\nDebug Info: \n#########################################################\nColumns: \n" 
				+ columnNames);
		System.out.println("\n#########################################################\nTable by Columns: \n" 
				+ tableByColumns);
		System.out.println("\n#########################################################\nTable by Rows:\n"  
				+ tableByRows);
		return tableByColumns;
	}

	@Override
	public Map<String, List<String>> visitHeader(HeaderContext ctx) {
		// Parse the Header
		ctx.row().FIELD().forEach(field -> {
			String fieldName = field.getText();
			tableByColumns.put(fieldName, new LinkedList<String>());
			columnNames.add(fieldName);
		}
				);
		return tableByColumns;
	}

	@Override
	public Map<String, List<String>> visitRow(RowContext ctx) {
		// Debug
		// System.out.println("Parsing row " + ctx.getText() + "...");
		// System.out.println("Number of the fields in the row is " + ctx.FIELD().size());
		// System.out.println("Number of columns is " + columnNames.size() + "\n");

		// Read all fields in the row
		List<TerminalNode> fieldsInRow = ctx.FIELD();

		// verify if row is valid
		if (fieldsInRow.size() != columnNames.size()) {		
			err.println("ERROR! Row " + ctx.getText().replace("\n", ""  ) + " has an invalid number of fields! Row won't be added.");
		}
		// if so, adds it
		else {
			LinkedList<String> row = new LinkedList<String>();

			for (int i = 0; i < fieldsInRow.size(); i++)  {
				// to the table 
				List<String> columnToChange = tableByColumns.get(columnNames.get(i));
				String fieldText = fieldsInRow.get(i).getText();
				columnToChange.add(fieldText);

				// to the list of rows
				row.add(fieldText.toString());
			}

			// update list of rows
			tableByRows.add(row);
		}

		return tableByColumns;
	}

}
