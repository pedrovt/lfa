// Generated from Calculator_v2.g4 by ANTLR 4.7.1

  import java.util.Map;
  import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Calculator_v2Parser}.
 */
public interface Calculator_v2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Calculator_v2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Calculator_v2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calculator_v2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Calculator_v2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Calculator_v2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Calculator_v2Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calculator_v2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Calculator_v2Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Calculator_v2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Calculator_v2Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calculator_v2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Calculator_v2Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Calculator_v2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Calculator_v2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calculator_v2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Calculator_v2Parser.ExprContext ctx);
}