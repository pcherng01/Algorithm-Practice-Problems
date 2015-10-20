package CrackCodeInterview;

// Maximum difference between two elements such that larger element appears after the smaller number
// if array is [2,3,10,6,4,8,1], retuned value should be 8
public class MaxDifferenceBetweenTwoElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] anArr = { 2, 3, 10, 6, 4, 8, 1, 10 };
		System.out.println("Max Difference: " + betterMaxDifference(anArr));
	}

	// Assuming that we have two elements in array
	// n^2 operation
	public static int maxDifference(int arr[]) {
		int maxDifference = arr[1] - arr[0];
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if ((arr[j] - arr[i]) > maxDifference)
					maxDifference = arr[j] - arr[i];
			}
		}
		return maxDifference;
	}

	// Assuming that we have two elements in the array
	public static int betterMaxDifference(int arr[]) {
		int maxDifferent = arr[1] - arr[0];
		int minElement = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - minElement > maxDifferent)
				maxDifferent = arr[i] - minElement;
			if (arr[i] < minElement)
				minElement = arr[i];
		}

		return maxDifferent;
	}

}
