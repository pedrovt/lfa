package G1;

/**
 * G1 - Ex3_4_Test
 * Formal And Automated Languages
 * @author Pedro Teixeira, 84715, MIECT
 */

public class Ex3_4_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumberDictionary n = new NumberDictionary("LFA\\G1\\numbers.txt");
		System.out.println("Translation:\n\teight million two hundred thousand five hundred twenty-four -> " + n.getTranslation("eight million two hundred thousand five hundred twenty-four") + "\n\ttwo thousand and thirty three -> " + n.getTranslation("two thousand and thirty three") );
		System.out.println("Smart Translation:\n\teight million two hundred thousand five hundred twenty-four -> " + n.getSmartTranslation("eight million two hundred thousand five hundred twenty-four") + "\n\ttwo thousand and thirty three -> " + n.getSmartTranslation("two thousand and thirty three") );
	}

}
