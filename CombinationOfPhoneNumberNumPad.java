package CrackCodeInterview;

public class CombinationOfPhoneNumberNumPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinationOfPhoneNumberNumPad ans = new CombinationOfPhoneNumberNumPad();
		ans.printNum(4);
	}

	String[] numChar = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs",
			"tuv", "wxyz" };

	public void printNum(int n) {
		printComb(2, n, "");
	}

	public void printComb(int start, int end, String output) {
		if (output.length() == (end - 1)) {
			System.out.print(output + " ");
			return;
		}

		for (int i = 0; i < numChar[start].length(); i++) {
			printComb(start + 1, end, output + numChar[start].charAt(i));
			System.out.println();
		}
	}
}
