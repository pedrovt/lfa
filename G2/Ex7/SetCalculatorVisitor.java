// Generated from SetCalculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SetCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SetCalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SetCalculatorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SetCalculatorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetCalculatorParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(SetCalculatorParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr_Union}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_Union(SetCalculatorParser.Expr_UnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr_Assignment}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_Assignment(SetCalculatorParser.Expr_AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr_Set}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_Set(SetCalculatorParser.Expr_SetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr_Parentesis}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_Parentesis(SetCalculatorParser.Expr_ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr_Intersection}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_Intersection(SetCalculatorParser.Expr_IntersectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr_Diference}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_Diference(SetCalculatorParser.Expr_DiferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr_Variable}
	 * labeled alternative in {@link SetCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_Variable(SetCalculatorParser.Expr_VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetCalculatorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SetCalculatorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetCalculatorParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(SetCalculatorParser.SetContext ctx);
}