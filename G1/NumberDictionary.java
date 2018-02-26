package G1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * G1 - NumberDictionary
 * Formal And Automated Languages
 * @author Pedro Teixeira, 84715, MIECT
 */

public class NumberDictionary {

	// Fields
	private Map<String, Integer> numsDictionary;

	// CTOR
	/**
	 * Constructor
	 * @param filePath Path to the dictionary file
	 */
	public NumberDictionary (String filePath) {
		addNumberKeys(filePath);
	}

	// Setters
	/**
	 * 
	 * @param filePath
	 */
	public void addNumberKeys (String filePath) {
		// Get info from file
		File inFile = new File(filePath);
		if (!inFile.exists() || !inFile.canRead()) {
			System.err.println("Error: " + inFile.getPath() + " number file is not valid.");
			System.exit(1);
		}

		// Use info from file to create a dictionary
		numsDictionary = new HashMap<>();

		try {
			Scanner scFile = new Scanner(inFile);

			while(scFile.hasNextLine()) {

				// Read line
				String line = scFile.nextLine();
				String[] lineContents = line.split("\\s+-\\s+");

				// key is the text (eg "eight"), element is the number (eg 8)
				try {
					numsDictionary.put(lineContents[1], Integer.parseInt(lineContents[0]));		
				} catch (NumberFormatException e) {
					System.err.println("Error: " + lineContents[0] + " is not a valid number. It will be ignored.");
				}

			}

			scFile.close();
		} catch (FileNotFoundException e) {
			System.err.println("Error: File not Found.");
		}
	}

	// Methods
	/**
	 * Translates the given numbers (in full) one by one
	 * @param  line 
	 * @return translation of the given numbers (in full) one by one 
	 */
	public String getTranslation(String line) {
		String nums[] = line.split("\\s+|-");

		StringBuilder result = new StringBuilder(); 

		for (String num : nums) {
			if (numsDictionary.containsKey(num)) result.append(numsDictionary.get(num));
			else result.append(num);		// keeps remaining word
			result.append(" ");
		}

		return result.toString();
	}


	/**
	 * Translates the given number (in full)
	 * @param  line 
	 * @return translation of the given number (in full)  
	 */
	public int getSmartTranslation(String line) {
		String numsKeys[] = line.split("\\s+|-");

		int result = 0; 
		int previousNum = 0;
		int aux = 1;		// can't be 0 otherwise on the first iteration, aux != currentNum

		for (String numKey : numsKeys) {
			if (numsDictionary.containsKey(numKey)) {	// ignores non-number elements
				int currentNum = numsDictionary.get(numKey); 
				if (previousNum < currentNum) {			
					aux *= currentNum;
				}
				else {
					result += aux;
					aux = currentNum;
				}
				previousNum = currentNum;
			}
		}
		result += aux;		// fixes the fact last number is not added to the result

		return result;
	}

	// Other methods
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NumberDictionary [");
		if (numsDictionary != null) {
			builder.append("translator=");
			builder.append(numsDictionary);
		}
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numsDictionary == null) ? 0 : numsDictionary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		NumberDictionary other = (NumberDictionary) obj;
		if (numsDictionary == null) {
			if (other.numsDictionary != null) {
				return false;
			}
		} else if (!numsDictionary.equals(other.numsDictionary)) {
			return false;
		}
		return true;
	}
}
