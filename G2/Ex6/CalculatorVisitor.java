// Generated from Calculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStat(CalculatorParser.ExprStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStat}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStat(CalculatorParser.AssignmentStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VARIABLE}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVARIABLE(CalculatorParser.VARIABLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUM(CalculatorParser.NUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARENTESIS_EXPR}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARENTESIS_EXPR(CalculatorParser.PARENTESIS_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULT_DIV}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULT_DIV(CalculatorParser.MULT_DIVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADD_SUB}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADD_SUB(CalculatorParser.ADD_SUBContext ctx);
}