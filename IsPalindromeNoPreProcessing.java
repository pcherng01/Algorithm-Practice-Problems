package CrackCodeInterview;

public class IsPalindromeNoPreProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isPalindrome(String input1, String input2) {
		if (input1.length() != input2.length()) {
			return false;
		}
		int forwardIter = 0;
		int backwardIter = input2.length() - 1;
		while (!(forwardIter > input1.length() - 1) || !(backwardIter < 0)) {
			if (input1.charAt(forwardIter) != input2.charAt(backwardIter))
				return false;
			forwardIter++;
			backwardIter--;
		}
		return true;
	}
}
