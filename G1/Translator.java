package G1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * G1 - Translator
 * Formal And Automated Languages
 * @author Pedro Teixeira, 84715, MIECT
 */

// IMPORTANT: this version of the code is not optimized, since this exercise has been used to review JAVA I/O and Streams

public class Translator {

	// Instance Fields
	private Map<String, String> translationsDictionary;
	private Map<String, String> definitionsDictionary;

	// CTORs
	/**
	 * Constructor
	 * @param path path to the file with a translations dictionary
	 */
	public Translator(String path) {
		translationsDictionary = new HashMap<>();
		definitionsDictionary = new HashMap<>();
		addTranslations(path);
	}

	// Getters
	/**
	 * Get translation of the words in the file 
	 * @param path path to the file
	 * @return translation of the words in the file 
	 */
	public String getTranslation(String path) {
		return getTranslation(path, false);
	}

	/**
	 * Get definition of the words in the file 
	 * @param path path to the file
	 * @return definition of the words in the file 
	 */
	public String getDefinitionsTranslation(String path) {
		return getTranslation(path, true);
	}

	// Setters
	/**
	 * Updates the Translations Dictionary with the information in the given file
	 * @param path path to the file
	 * @return {@code true} if the dictionary is updated, else {@code false}
	 */
	public boolean addTranslations(String path) {
		try {
			translationsDictionary.putAll(Files.readAllLines(parseFile(path)).stream().map(str -> str.split("\\s+")).collect(Collectors.toMap(word -> word[0], word -> word[1])));
			translationsDictionary.forEach((x, y) -> System.out.println("Dictionary Key: " + x +"\t | Value: "+ y));
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Updates the Definitions Dictionary with the information in the given file
	 * @param path path to the file
	 * @return {@code true} if the dictionary is updated, else {@code false}
	 */
	public boolean addDefinitionsTranslations(String path) {	
		try {
			definitionsDictionary.putAll(Files.readAllLines(parseFile(path)).stream().map(str -> str.split("\\s+")).collect(Collectors.toMap(word -> word[0], word -> Arrays.toString(Arrays.copyOfRange(word, 1, word.length)).replaceAll("\\[|\\]|,", ""))));
			definitionsDictionary.forEach((x, y) -> System.out.println("Definition Dictionary Key: " + x +"\t | Value: "+ y));
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	// Other Methods
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((definitionsDictionary == null) ? 0 : definitionsDictionary.hashCode());
		result = prime * result + ((translationsDictionary == null) ? 0 : translationsDictionary.hashCode());
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
		Translator other = (Translator) obj;
		if (definitionsDictionary == null) {
			if (other.definitionsDictionary != null) {
				return false;
			}
		} else if (!definitionsDictionary.equals(other.definitionsDictionary)) {
			return false;
		}
		if (translationsDictionary == null) {
			if (other.translationsDictionary != null) {
				return false;
			}
		} else if (!translationsDictionary.equals(other.translationsDictionary)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Translator [");
		if (translationsDictionary != null) {
			builder.append("translationsDictionary=");
			builder.append(translationsDictionary);
			builder.append(", ");
		}
		if (definitionsDictionary != null) {
			builder.append("definitionsDictionary=");
			builder.append(definitionsDictionary);
		}
		builder.append("]");
		return builder.toString();
	}

	// Auxiliary Methods
	/**
	 * Parses the file info and adds the said info to the dictionary Map
	 * @param path
	 */
	private Path parseFile(String path) {
		assert translationsDictionary != null : "Dictionary Map can't be null";

		Path filePath = Paths.get(path);
		assert Files.exists(filePath) && Files.isReadable(filePath) && !Files.isDirectory(filePath) : "File error";

		return filePath;

	}

	private String getTranslation(String path, boolean isDefinition){
		assert path != null : "Path can't be null";

		StringBuilder s = new StringBuilder();
		try {
			Files.readAllLines(parseFile(path)).forEach(str -> parseStr(str, s, isDefinition));
			return s.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "I/O Error";
	} 

	private void parseStr(String str, StringBuilder s, boolean isDefinition) {
		assert str != null : "String to parse can't be null";
		assert definitionsDictionary != null && translationsDictionary != null: "Dictionary can't be null";
		assert s != null : "StringBuilder can't be null";

		Map<String, String> dictionary = isDefinition? definitionsDictionary : translationsDictionary;
		String[] words = str.split("\\s+");
		for (String word: words) { 
			if (dictionary.containsKey(word)) {
				String value = dictionary.get(word);		// translation/definition of word
				if (isDefinition) {							// for definitions only
					parseStr(value, s, isDefinition);
				}
				else {
					s.append(value);
					s.append(" ");
				}
			}
			else {
				s.append(word);
				s.append(" ");
			}
		}
	}
}
