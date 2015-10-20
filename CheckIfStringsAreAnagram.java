package CrackCodeInterview;

import java.util.Arrays;

public class CheckIfStringsAreAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		String string1 = "olleh";
		String string2 = "hello";
		System.out.println(isAnagram(string1, string2));*/

	}

	// Sort both strings, check if they are equals
	public static boolean isAnagram(String pString1, String pString2) {
		String string1 = pString1.replaceAll("[^a-zA-Z]", "").toLowerCase();
		String string2 = pString2.replaceAll("[^a-zA-Z]", "").toLowerCase();
		if (string1.length() != string2.length())
			return false;

		char[] chars1 = string1.toCharArray();
		char[] chars2 = string2.toCharArray();

		Arrays.sort(chars1);
		Arrays.sort(chars2);

		for (int i = 0; i < chars1.length; i++) {
			if (chars1[i] != chars2[i])
				return false;
		}

		//or
		// return Arrays.equals(chars1, chars2);

		return true;

	}

	public static boolean anagram2(String string1, String string2) {
		String aString1 = string1.replaceAll("[^a-zA-Z", "").toLowerCase();
		String aString2 = string2.replaceAll("[^a-zA-Z", "").toLowerCase();
		if (aString1.length() != aString2.length()) {
			return false;
		}

		char[] newString1 = aString1.toCharArray();
		char[] newString2 = aString2.toCharArray();
		Arrays.sort(newString1);
		Arrays.sort(newString2);

		for (int i = 0; i < newString1.length; i++) {
			if (newString1[i] != newString2[i])
				return false;
		}
		return true;

	}

}
