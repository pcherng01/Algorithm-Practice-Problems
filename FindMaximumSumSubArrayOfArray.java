package CrackCodeInterview;

public class FindMaximumSumSubArrayOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int returnMaxSumSubArray(int[] pArray) {
		int maxSoFar = 0;
		int maxEndingHere = 0;
		for (int i = 0; i < pArray.length; i++) {
			maxEndingHere = maxEndingHere + pArray[i];
			if (maxEndingHere < 0) {
				maxEndingHere = 0;
			}
			if (maxSoFar < maxEndingHere) {
				maxSoFar = maxEndingHere;
			}
		}
		return maxSoFar;
	}

	/**
	 * Run thru the array, the sum starts with 0 As you add element, check if
	 * it's greater than maxSum if it is update it, if not do nothing
	 * 
	 * @param arr
	 * @return
	 */
	public static int maxSumSubarray(int[] arr) {
		int maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (maxSum + arr[i] > maxSum) {
				maxSum = maxSum + arr[i];
			}
			if (maxSum < 0) {
				maxSum = 0;
			}
		}
		return maxSum;
	}
}
