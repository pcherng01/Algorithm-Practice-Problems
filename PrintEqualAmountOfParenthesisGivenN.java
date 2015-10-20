package CrackCodeInterview;

public class PrintEqualAmountOfParenthesisGivenN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void printPar(int left, int right, String str) {
		if (left == 0 && right == 0) {
			System.out.println(str);
		}

		if (left > right) {
			return;
		}

		if (left > 0) {
			printPar(left - 1, right, str + "(");
		}
		if (right > 0) {
			printPar(left, right - 1, str + ")");
		}
	}

}
