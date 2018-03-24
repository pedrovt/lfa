import java.util.Iterator;

public class Interpreter extends CalculatorBaseVisitor<String> {

	@Override
	public String visitProgram(CalculatorParser.ProgramContext ctx) {
		// Multiple statements on a program
		System.out.println("VISITING PROGRAM 	");
		String res = "";
		Iterator<CalculatorParser.StatContext> iterator = ctx.stat().iterator();
		while (iterator.hasNext()) {
			res += visit(iterator.next());
			res += " HELLO \n";
		}
		return res;
	}

	@Override
	public String visitExprStat(CalculatorParser.ExprStatContext ctx) {
		return visit(ctx.expr());
	}

	@Override
	public String visitAssignmentStat(CalculatorParser.AssignmentStatContext ctx) {
		return visit(ctx.assignment());
	}

	@Override
	public String visitAssignment(CalculatorParser.AssignmentContext ctx) {
		return ctx.ID().getText() + " " + visit(ctx.expr()) + " =";
	}

	@Override
	public String visitVARIABLE(CalculatorParser.VARIABLEContext ctx) {
		return ctx.ID().getText();
	}

	@Override
	public String visitNUM(CalculatorParser.NUMContext ctx) {
		return ctx.INT().getText();
	}

	@Override
	public String visitPARENTESIS_EXPR(CalculatorParser.PARENTESIS_EXPRContext ctx) {
		return visit(ctx.expr());
	}

	@Override
	public String visitMULT_DIV(CalculatorParser.MULT_DIVContext ctx) {
		return visit(ctx.expr(0)) + " " + visit(ctx.expr(2)) + " " + ctx.getToken(1, 1).getText();
	}

	@Override
	public String visitADD_SUB(CalculatorParser.ADD_SUBContext ctx) {
		return visit(ctx.expr(0)) + " " + visit(ctx.expr(2)) + " " + ctx.getToken(1, 1).getText();
	}
}
