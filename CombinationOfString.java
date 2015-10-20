package CrackCodeInterview;

public class CombinationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCombination("wxyz");
	}

	/*
	 * Combination of string so for example:
	 * "wxyz" --> w, wx, wxy, wxyz, x, xy, xyz, y, yz, z
	 */
	public static void printCombination(String str) {
		printComb("", str);
	}

	public static void printComb(String output, String str) {
		if (output.length() > 0) {
			System.out.println(output);
		}

		for (int i = 0; i < str.length(); i++) {
			printComb(output + str.charAt(i), str.substring(i + 1));
		}
	}
}
