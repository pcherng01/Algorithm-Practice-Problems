package CrackCodeInterview;

public class PrintLongestCommonSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestCommonSubstring("abcdef", "acbcf"));
		//System.out.println(longestCommonSubstring2("abcdef", "gbcdh"));
	}

	public static int longestCommonSubstring(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();

		int[][] matrix = new int[len1 + 1][len2 + 1];
		int longest = 0;

		for (int row = 1; row <= len1; row++) {
			for (int col = 1; col <= len2; col++) {
				if (str1.charAt(row - 1) == str2.charAt(col - 1)) {
					matrix[row][col] = matrix[row - 1][col - 1] + 1;
					if (matrix[row][col] > longest) {
						longest = matrix[row][col];
					}
				}
			}
		}
		return longest;
	}

	public static String longestCommonSubstring2(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();

		int longestCommon = 0;
		int maxRowIndex = 0;
		int maxColIndex = 0;

		int[][] matrix = new int[len1 + 1][len2 + 1];

		for (int row = 1; row <= len1; row++) {
			for (int col = 1; col <= len2; col++) {
				if (str1.charAt(row - 1) == str2.charAt(col - 1)) {
					matrix[row][col] = matrix[row - 1][col - 1] + 1;
					if (matrix[row][col] > longestCommon) {
						longestCommon = matrix[row][col];
						maxRowIndex = row;
						maxColIndex = col;
					}
				}
			}
		}
		StringBuilder ans = new StringBuilder();
		while (longestCommon > 0) {
			ans.insert(0, "" + str1.charAt(maxRowIndex - 1));
			maxRowIndex--;
			longestCommon--;
		}
		String answer = ans.toString();
		return answer;
	}
}
