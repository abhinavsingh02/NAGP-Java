package exercise.fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class OccurenceOfCharInString {
	static void characterCount(String inputString) {
		// Creating a HashMap containing char
		// as a key and occurrences as a value
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		// Converting given string to char array

		char[] strArray = inputString.toCharArray();

		// checking each char of strArray
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {

				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		// Printing the charCountMap
		for (Map.Entry entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	// Driver Code
	public static void main(String[] args) throws IOException {
		File file = new File("demo.txt");
		FileReader obj = new FileReader(file);
		int c;
		char[] value = new char[1000];
		int i = 0;
		while ((c = obj.read()) != -1) {
			value[i] = (char) c;
			i++;
			// System.out.println((char)c);
		}
		obj.close();
		characterCount(new String(value));

	}
}