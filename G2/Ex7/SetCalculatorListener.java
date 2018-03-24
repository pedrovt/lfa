// Generated from SetCalculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SetCalculatorParser}.
 */
public interface SetCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SetCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SetCalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SetCalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetCalculatorParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(SetCalculatorParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetCalculatorParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(SetCalculatorParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expr_Union}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_Union(SetCalculatorParser.Expr_UnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expr_Union}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_Union(SetCalculatorParser.Expr_UnionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expr_Assignment}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_Assignment(SetCalculatorParser.Expr_AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expr_Assignment}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_Assignment(SetCalculatorParser.Expr_AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expr_Set}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_Set(SetCalculatorParser.Expr_SetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expr_Set}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_Set(SetCalculatorParser.Expr_SetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expr_Parentesis}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_Parentesis(SetCalculatorParser.Expr_ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expr_Parentesis}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_Parentesis(SetCalculatorParser.Expr_ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expr_Intersection}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_Intersection(SetCalculatorParser.Expr_IntersectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expr_Intersection}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_Intersection(SetCalculatorParser.Expr_IntersectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expr_Diference}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_Diference(SetCalculatorParser.Expr_DiferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expr_Diference}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_Diference(SetCalculatorParser.Expr_DiferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expr_Variable}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_Variable(SetCalculatorParser.Expr_VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expr_Variable}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_Variable(SetCalculatorParser.Expr_VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetCalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SetCalculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetCalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SetCalculatorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetCalculatorParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(SetCalculatorParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetCalculatorParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(SetCalculatorParser.SetContext ctx);
}