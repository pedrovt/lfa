// Generated from Calculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExprStat(CalculatorParser.ExprStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExprStat(CalculatorParser.ExprStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStat}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStat(CalculatorParser.AssignmentStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStat}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStat(CalculatorParser.AssignmentStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VARIABLE}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVARIABLE(CalculatorParser.VARIABLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VARIABLE}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVARIABLE(CalculatorParser.VARIABLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNUM(CalculatorParser.NUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNUM(CalculatorParser.NUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARENTESIS_EXPR}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPARENTESIS_EXPR(CalculatorParser.PARENTESIS_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARENTESIS_EXPR}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPARENTESIS_EXPR(CalculatorParser.PARENTESIS_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULT_DIV}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMULT_DIV(CalculatorParser.MULT_DIVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULT_DIV}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMULT_DIV(CalculatorParser.MULT_DIVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD_SUB}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterADD_SUB(CalculatorParser.ADD_SUBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD_SUB}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitADD_SUB(CalculatorParser.ADD_SUBContext ctx);
}