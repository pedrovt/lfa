import static java.lang.System.out;
public class Java8ReflectionWithANTLR extends Java8BaseListener {

	private static int countMethods = 0;

	@Override public void enterNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
		out.println("Class Name: " + ctx.Identifier().getText());
	}

	@Override public void enterMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
		out.println("Method #" + countMethods + " name: " + ctx.Identifier().getText());
		countMethods++;
	}

}