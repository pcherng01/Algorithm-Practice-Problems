package CrackCodeInterview;

import java.util.Arrays;

public class DetermineIfStringHasAllUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUniqueChar("abcdefghig"));
	}

	public static boolean isUniqueChars2(String str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[i])
				return false;
			char_set[i] = true;
		}
		return true;
	}

	// Sort the array and check its neighbor if it's the same, if it is
	// then return false because it's not unique
	public static boolean isUniqueChar(String str) {
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		for (int i = 0; i < charArr.length - 1; i++) {
			if (charArr[i] == charArr[i + 1])
				return false;
		}
		return true;
	}
}
