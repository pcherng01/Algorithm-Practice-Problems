package CrackCodeInterview;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "geeksforgeeks";
		char[] charArray = input.toCharArray();
		input = removeDuplicates(charArray);
		System.out.println(input);
	}

	// Remove all duplicates from the input string
	public static String removeDuplicates(char[] charArray) {
		int inputIndex = 0;
		Map<Character, Character> hash = new LinkedHashMap<Character, Character>();
		while (inputIndex < charArray.length) {
			if (!hash.containsKey(charArray[inputIndex])) {
				hash.put(charArray[inputIndex], charArray[inputIndex]);
			}
			inputIndex++;
		}
		StringBuilder aBuilder = new StringBuilder();
		for (Character c : hash.keySet()) {
			aBuilder.append(c);
		}

		return aBuilder.toString();
	}

}
