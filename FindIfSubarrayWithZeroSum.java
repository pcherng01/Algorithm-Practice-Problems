package CrackCodeInterview;

import java.util.HashMap;

public class FindIfSubarrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Find out if subarray within array contains sum that adds up to 0 Example:
	 * {4,2,-3,1,6} --> true, index 1 to index 3 why? 4 + [index1 --> index3] =
	 * 4. Which mean starting from index1 to index3 the sum is 0.
	 */

	public static boolean sumZeroSubArray(int[] arr) {

		// Make a hashmap to store each element as key, and sumSoFar as Value
		HashMap<Integer, Integer> aHM = new HashMap<Integer, Integer>();

		int sumSoFar = 0;
		for (int i = 0; i < arr.length; i++) {
			sumSoFar += arr[i];

			if (i == 0 || sumSoFar == 0 || aHM.containsKey(sumSoFar)) {
				return true;
			}
			aHM.put(i, sumSoFar);

		}
		return false;
	}
}
