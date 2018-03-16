// Generated from Tradutor.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TradutorParser}.
 */
public interface TradutorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TradutorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TradutorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TradutorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TradutorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TradutorParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(TradutorParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TradutorParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(TradutorParser.LineContext ctx);
}