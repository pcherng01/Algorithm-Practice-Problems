package CrackCodeInterview;

public class FindSubarrayWithGivenSum {

	public static int subArraySum(int arr[], int sum) {
		int currentSum = arr[0];
		int start = 0;

		// Add elements one by one to currentSum and if the currentSum
		//  exceeds the sum, then remove the starting element
		// i <= arr.length because 
		for (int i = 1; i <= arr.length; i++) {

			// If currentSum exceeds the sum, then remove the starting elements
			while (currentSum > sum && start < i - 1) {
				currentSum = currentSum - arr[start];
				start++;
			}

			// If currentSum becomes equal to sum, then return true
			if (currentSum == sum) {
				System.out.println("Sum found between index " + start + " and "
						+ (i - 1));
				return 1;
			}

			// Add this element to currentSum
			if (i < arr.length) {
				currentSum = currentSum + arr[i];
			}
		}
		System.out.println("No subarray found");
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
