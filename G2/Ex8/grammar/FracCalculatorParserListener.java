// Generated from FracCalculatorParser.g4 by ANTLR 4.7.1

package grammar;	

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FracCalculatorParser}.
 */
public interface FracCalculatorParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FracCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FracCalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FracCalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracCalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(FracCalculatorParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracCalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(FracCalculatorParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracCalculatorParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(FracCalculatorParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracCalculatorParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(FracCalculatorParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracCalculatorParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(FracCalculatorParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracCalculatorParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(FracCalculatorParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFrac}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFrac(FracCalculatorParser.ExprFracContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFrac}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFrac(FracCalculatorParser.ExprFracContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParentesis}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParentesis(FracCalculatorParser.ExprParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParentesis}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParentesis(FracCalculatorParser.ExprParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDivisionMultiply}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDivisionMultiply(FracCalculatorParser.ExprDivisionMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDivisionMultiply}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDivisionMultiply(FracCalculatorParser.ExprDivisionMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddDifference}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddDifference(FracCalculatorParser.ExprAddDifferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddDifference}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddDifference(FracCalculatorParser.ExprAddDifferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPower}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPower(FracCalculatorParser.ExprPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPower}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPower(FracCalculatorParser.ExprPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReduce(FracCalculatorParser.ExprReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReduce(FracCalculatorParser.ExprReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVariable(FracCalculatorParser.ExprVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVariable(FracCalculatorParser.ExprVariableContext ctx);
}