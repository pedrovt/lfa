import java.util.Iterator;

public class ConvertToSuffixExpr extends Calculator_v3BaseVisitor<String> {

	@Override
	public String visitProgram(Calculator_v3Parser.ProgramContext ctx) {
		// Multiple statements on a program
		System.out.println("VISITING PROGRAM 	");
		String res = "";
		Iterator<Calculator_v3Parser.StatContext> iterator = ctx.stat().iterator();
		while (iterator.hasNext()) {
			res += visit(iterator.next());
			res += " HELLO \n";
		}
		return res;
	}

	@Override
	public String visitExprStat(Calculator_v3Parser.ExprStatContext ctx) {
		return visit(ctx.expr());
	}

	@Override
	public String visitAssignmentStat(Calculator_v3Parser.AssignmentStatContext ctx) {
		return visit(ctx.assignment());
	}

	@Override
	public String visitAssignment(Calculator_v3Parser.AssignmentContext ctx) {
		return ctx.ID().getText() + " " + visit(ctx.expr()) + " =";
	}

	@Override
	public String visitVARIABLE(Calculator_v3Parser.VARIABLEContext ctx) {
		return ctx.ID().getText();
	}

	@Override
	public String visitNUM(Calculator_v3Parser.NUMContext ctx) {
		return ctx.INT().getText();
	}

	@Override
	public String visitPARENTESIS_EXPR(Calculator_v3Parser.PARENTESIS_EXPRContext ctx) {
		return visit(ctx.expr());
	}

	@Override
	public String visitMULT_DIV(Calculator_v3Parser.MULT_DIVContext ctx) {
		return visit(ctx.expr(0)) + " " + visit(ctx.expr(2)) + " " + ctx.getToken(1, 1).getText();
	}

	@Override
	public String visitADD_SUB(Calculator_v3Parser.ADD_SUBContext ctx) {
		return visit(ctx.expr(0)) + " " + visit(ctx.expr(2)) + " " + ctx.getToken(1, 1).getText();
	}
}
