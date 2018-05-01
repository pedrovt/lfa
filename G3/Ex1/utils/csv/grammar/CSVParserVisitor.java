// Generated from CSVParser.g4 by ANTLR 4.7.1

// --------------------------------
// CSVParser
// Formal and Automated Languages
// Pedro Teixeira, 84715, MIECT
// --------------------------------

package utils.csv.grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSVParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSVParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSVParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CSVParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(CSVParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(CSVParser.RowContext ctx);
}