// Generated from SetCalculator.g4 by ANTLR 4.7.1
import static java.lang.System.err;
import static java.lang.System.exit;
import static java.lang.System.out;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.tree.TerminalNode;

public class SetCalculatorInterpreter extends SetCalculatorBaseVisitor<Set<String>> {

	// Instance Fields
	private Map<String, Set<String>> symbolTable = new HashMap<>();
	private Set<String> set;

	// ------------------------------------------------------------------------------
	// Methods
	@Override
	public Set<String> visitLine(SetCalculatorParser.LineContext ctx) {
		Set<String> result = visit(ctx.expr());
		String str = result.toString();
		str = "{" + str.substring(1,str.length()-1).replaceAll(" ","") + "}";
		out.println("result: " + str);
		return result;

	}

	// --------------------------------------
	// Operations on Expressions
	@Override
	public Set<String> visitExpr_Union(SetCalculatorParser.Expr_UnionContext ctx) {
		set = new HashSet<>();
		ctx.expr().forEach(expr -> set.addAll(visit(expr)));
		return set;
	}

	@Override
	public Set<String> visitExpr_Set(SetCalculatorParser.Expr_SetContext ctx) {
		return visit(ctx.set());
	}

	@Override
	public Set<String> visitExpr_Parentesis(SetCalculatorParser.Expr_ParentesisContext ctx) {
		return visit(ctx.expr());
	}

	@Override
	public Set<String> visitExpr_Intersection(SetCalculatorParser.Expr_IntersectionContext ctx) {
		set = new HashSet<>();
		set.addAll(visit(ctx.expr(0)));
		set.retainAll(visit(ctx.expr(1)));		// intersection
		return set;
	}

	@Override
	public Set<String> visitExpr_Diference(SetCalculatorParser.Expr_DiferenceContext ctx) {
		set = new HashSet<>();
		set.addAll(visit(ctx.expr(0)));
		set.removeAll(visit(ctx.expr(1)));		// difference
		return set;
	}

	// --------------------------------------
	// Variables
	@Override
	public Set<String> visitExpr_Assignment(SetCalculatorParser.Expr_AssignmentContext ctx) {
		return visit(ctx.assignment());
	}

	@Override
	public Set<String> visitExpr_Variable(SetCalculatorParser.Expr_VariableContext ctx) {
		String key = ctx.ID().getText();
		if (!symbolTable.containsKey(key)) {
			err.println("ID " + key + " not valid!");
			exit(1);
		}
		return symbolTable.get(key);
	}

	@Override
	public Set<String> visitAssignment(SetCalculatorParser.AssignmentContext ctx) {
		// Get the Set from the expr 
		Set<String> result = visit(ctx.expr());

		// Update the symbol table
		symbolTable.put(ctx.ID().getText(), result);		
		return result;
	}

	// --------------------------------------
	// Set
	@Override
	public Set<String> visitSet(SetCalculatorParser.SetContext ctx) {
		set = new HashSet<>();

		List<TerminalNode> nums = ctx.NUM();
		if (nums.size() != 0) {
			nums.forEach(num -> set.add(num.getText()));
		}
		else {
			ctx.WORD().forEach(word -> set.add(word.getText()));
		}

		System.out.println("set: " + set);
		return set;
	}
}
