package G1;

/**
 * G1 - Ex6_Test
 * Formal And Automated Languages
 * @author Pedro Teixeira, 84715, MIECT
 */

public class Ex6_Test {

	public static void main (String[] args) {
		// Tests
		/*
		System.out.println(args[0]);
		System.out.println(args[1]);

		Translator t = new Translator(args[0]);
		System.out.println("Translation " + t.getTranslation(args[1]));

		 */
		Translator t = new Translator("LFA\\G1\\dicErrado1.txt");
		t.addDefinitionsTranslations("LFA\\G1\\dic2.txt");
		System.out.println("Translation " + t.getTranslation("LFA\\G1\\texto1.txt"));
		System.out.println("Definitions Translation " + t.getDefinitionsTranslation("LFA\\G1\\texto1.txt"));



		System.exit(0);
	}
}
