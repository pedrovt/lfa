// Generated from SetCalculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class Interpreter extends SetCalculatorBaseVisitor<Set<String>> {

  // Instance Fields
	private Map<String, Set<String>> symbolTable = new HashMap<>();;

	// Methods
	@Override
	public Set<String> visitProgram(SetCalculatorParser.ProgramContext ctx) {
		 return visitChildren(ctx);
	 }

	@Override
	public Set<String> visitLine(SetCalculatorParser.LineContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Set<String> visitExpr_Union(SetCalculatorParser.Expr_UnionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Set<String> visitExpr_Assignment(SetCalculatorParser.Expr_AssignmentContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Set<String> visitExpr_Set(SetCalculatorParser.Expr_SetContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Set<String> visitExpr_Parentesis(SetCalculatorParser.Expr_ParentesisContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Set<String> visitExpr_Intersection(SetCalculatorParser.Expr_IntersectionContext ctx) {
		 return visitChildren(ctx);
	 }

	@Override
	public Set<String> visitExpr_Diference(SetCalculatorParser.Expr_DiferenceContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Set<String> visitExpr_Variable(SetCalculatorParser.Expr_VariableContext ctx) {
		return visitChildren(ctx);
	 }

	@Override
	public Set<String> visitAssignment(SetCalculatorParser.AssignmentContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Set<String> visitSet(SetCalculatorParser.SetContext ctx) {
		return visitChildren(ctx);
	}
}
