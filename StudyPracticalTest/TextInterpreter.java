import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import static java.lang.System.*;

/**
 * Example of Practical Test Formal And Automated Languages
 * 
 * @author Pedro Teixeira, 84715, MIECT
 */
public class TextInterpreter extends TextGrammarBaseVisitor<String> {

    // Class Constants
    private static final Scanner in = new Scanner(System.in);
    
    // Instance Fields
    private Map<String, String> symbolTable = new HashMap<>();

    // Methods
    @Override
    public String visitPrint(TextGrammarParser.PrintContext ctx) {
        String result = visit(ctx.text());
        out.println(result);
        return result;
    }

    @Override
    public String visitAssign(TextGrammarParser.AssignContext ctx) {
        String result = visit(ctx.text());

        // Redefining variables is possible according to the given JAR
        symbolTable.put(ctx.ID().getText(), result);

        return result;
    }

    @Override
    public String visitTextInput(TextGrammarParser.TextInputContext ctx) {
        return visit(ctx.input());
    }

    @Override
    public String visitTextConcat(TextGrammarParser.TextConcatContext ctx) {
        String textA = visit(ctx.text(0));
        String textB = visit(ctx.text(1));

        return textA.concat(textB);
    }

    @Override
    public String visitTextReplace(TextGrammarParser.TextReplaceContext ctx) {
        String textA = visit(ctx.text(0));
        String textB = visit(ctx.text(1));
        String textC = visit(ctx.text(2));

        return textA.replaceAll(textB, textC);
    }

    @Override
    public String visitTextParenthesis(TextGrammarParser.TextParenthesisContext ctx) {
        return visit(ctx.text());
    }

    @Override
    public String visitTextID(TextGrammarParser.TextIDContext ctx) {
        String key = ctx.ID().getText();

        if (!symbolTable.containsKey(key)) {
            err.println("ERROR : Variable \"" + key + "\" not defined!");
            exit(1);
        }

        return symbolTable.get(key);
    }

    @Override
    public String visitTextSTRING(TextGrammarParser.TextSTRINGContext ctx) {
        String text = ctx.STRING().getText();
        return text.substring(1, text.length() - 1); // ommit the initial quote marks
    }

    @Override
    public String visitInput(TextGrammarParser.InputContext ctx) {
        String prompt = ctx.STRING().getText();
        out.print(prompt.substring(1, prompt.length() - 1)); // ommit the initial quote marks

        String text = in.nextLine();

        return text;
    }
}
