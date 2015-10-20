package CrackCodeInterview;

public class TwoTextMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(matchOrNot("abcdef", "gbcdh", 3));
	}

	/**
	 * Two texts are considered to "match" if they have a common substring of at
	 * least length n. Describe an algorithm to determine if two strings are
	 * matches.
	 */
	public static boolean matchOrNot(String str1, String str2, int n) {
		int len1 = str1.length();
		int len2 = str2.length();

		int[][] matrix = new int[len1 + 1][len2 + 1];
		int greatestCommon = 0;

		for (int row = 1; row <= len1; row++) {
			for (int col = 1; col <= len2; col++) {
				if (str1.charAt(row - 1) == str2.charAt(col - 1)) {
					matrix[row][col] = matrix[row - 1][col - 1] + 1;
					if (matrix[row][col] > greatestCommon) {
						greatestCommon = matrix[row][col];
					}
				}
			}
		}
		if (greatestCommon >= n) {
			return true;
		}
		return false;

	}
}
