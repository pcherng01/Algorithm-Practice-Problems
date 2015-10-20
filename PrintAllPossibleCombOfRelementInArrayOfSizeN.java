package CrackCodeInterview;

public class PrintAllPossibleCombOfRelementInArrayOfSizeN {
	public static void main(String[] args) {
		int[] ans = { 1, 2, 3, 4, 5 };
		PrintAllPossibleCombOfRelementInArrayOfSizeN ansz = new PrintAllPossibleCombOfRelementInArrayOfSizeN();
		ansz.printArray(ans, 3);
	}

	public void printArray(int[] arr, int nSize) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			str.append(arr[i]);
		}
		printComb("", nSize, str.toString());
	}

	public void printComb(String output, int nSize, String str) {
		if (output.length() == nSize) {
			System.out.println(output);
			return;
		}

		for (int i = 0; i < ((str.length() < nSize) ? str.length() : nSize); i++) {
			if (str.length() > 0) {
				printComb(output + str.charAt(i), nSize, str.substring(i + 1));
			}
		}
	}
}
