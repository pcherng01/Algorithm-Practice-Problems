package CrackCodeInterview;

import java.util.Stack;

public class FootBallScoreFacebookInterview {
	public static void main(String args[]) {
		FootBallScoreFacebookInterview hehe = new FootBallScoreFacebookInterview();
		int[] arrayz = { 1, 2, 3, 5, 7 };
		//hehe.printCombSum(arrayz, 10);
		hehe.printAllComb(arrayz);
	}

	public void printAllComb(int[] arr) {
		printCombSum(arr, 10, 0);
	}

	Stack<Integer> aStack = new Stack();

	public void printCombSum(int[] arr, int givenSum, int sumSoFar) {
		if (sumSoFar == givenSum) {
			System.out.println(aStack);
			aStack.pop();
			return;
		}
		if (sumSoFar > givenSum) {
			aStack.pop();
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			aStack.push(arr[i]);
			printCombSum(arr, 10, sumSoFar + arr[i]);
		}
		if (!aStack.isEmpty()) {
			aStack.pop();
		}
	}

}
