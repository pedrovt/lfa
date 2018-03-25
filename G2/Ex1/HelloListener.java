// Generated from Hello.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#top}.
	 * @param ctx the parse tree
	 */
	void enterTop(HelloParser.TopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#top}.
	 * @param ctx the parse tree
	 */
	void exitTop(HelloParser.TopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#greetings}.
	 * @param ctx the parse tree
	 */
	void enterGreetings(HelloParser.GreetingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#greetings}.
	 * @param ctx the parse tree
	 */
	void exitGreetings(HelloParser.GreetingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#bye}.
	 * @param ctx the parse tree
	 */
	void enterBye(HelloParser.ByeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#bye}.
	 * @param ctx the parse tree
	 */
	void exitBye(HelloParser.ByeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(HelloParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(HelloParser.IdsContext ctx);
}