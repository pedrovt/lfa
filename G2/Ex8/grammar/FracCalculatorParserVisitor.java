// Generated from FracCalculatorParser.g4 by ANTLR 4.7.1

package grammar;	

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FracCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FracCalculatorParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FracCalculatorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FracCalculatorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FracCalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(FracCalculatorParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link FracCalculatorParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(FracCalculatorParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FracCalculatorParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(FracCalculatorParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFrac}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFrac(FracCalculatorParser.ExprFracContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParentesis}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParentesis(FracCalculatorParser.ExprParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDivisionMultiply}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDivisionMultiply(FracCalculatorParser.ExprDivisionMultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddDifference}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddDifference(FracCalculatorParser.ExprAddDifferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPower}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPower(FracCalculatorParser.ExprPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReduce(FracCalculatorParser.ExprReduceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link FracCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVariable(FracCalculatorParser.ExprVariableContext ctx);
}