package CrackCodeInterview;

public class CheckRotationOfTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Assume you have a method isSubstring which hecks if one word is a
	 * substring of another. Given two strings, s1 and s2, write code to check
	 * if s2 is a rotation of s1 using only one call to isSubstring
	 * "waterbottle" is a rotation of "erbottlewat")
	 */

	// Adding string2 to string2 = erbottlewaterbottlewat
	public static boolean isRotation(String str1, String str2) {
		int len1 = str1.length();

		if (len1 == str2.length() && len1 > 0) {
			String nStr = str1 + str1;
			return isSubstring(nStr, str2);
		}
		return false;
	}

	public static boolean isSubstring(String str1, String str2) {
		return true;
	}
}
