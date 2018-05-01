// Generated from CSVParser.g4 by ANTLR 4.7.1

// --------------------------------
// CSVParser
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

package utils.csv.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSVParser}.
 */
public interface CSVParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSVParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CSVParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CSVParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(CSVParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(CSVParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(CSVParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(CSVParser.RowContext ctx);
}