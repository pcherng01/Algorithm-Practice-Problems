package CrackCodeInterview;

public class PermutationOfDigitsTranslateToLetter {

	// Given a library of numbers of corresponding letters(1 = a, 2 = b, 3 = c, etc)
	// and a string made up of digits, return how many different ways those digits can be translated to letters
	// "1111": "aaaa" "kaa" "aka" "aak" "kk"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * String aString = "1111"; System.out.println((char) ((int)
		 * aString.charAt(0) + 48));
		 */
		//printChar("1");

		printPerm("11111111");
		//String aString = "1";
		//System.out.println(aString.substring(0, 2));
		//System.out.println(aString.substring(2));
	}

	public static void printPerm(String str) {
		printPerm2("", str);
	}

	public static void printPerm2(String pre, String str) {
		if (str.length() == 0) {
			for (int i = 0; i < pre.length(); i++) {
				if (pre.charAt(i) == '?') {
					return;
				}
			}
			System.out.println(pre);
			return;
		}

		printPerm2(pre + returnChar("" + str.charAt(0)), str.substring(1));
		//printPerm2(pre + str.substring(0, 2), str.substring(2));
		//printPerm2(pre + returnChar(str.substring(0, 2)), str.substring(2));
		if (str.length() == 1) {
			return;
		} else {
			printPerm2(pre + returnChar(str.substring(0, 2)), str.substring(2));
		}
	}

	public static char returnChar(String str) {
		int value = Integer.parseInt(str);
		if (value >= 1 && value <= 26) {
			char aChar = (char) (value + 96);
			//System.out.println(aChar);
			return aChar;
		} else {
			return '?';
		}
	}
}
