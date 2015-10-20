package CrackCodeInterview;

public class MinMaxUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public void extractMinAndMax(int[] arr, Integer min, Integer max) {
		if (arr.length > 0) {
			// Set uup min and max to be the first element
			// if length is one then min and max is the same
			min = arr[0];
			max = arr[0];
			int arrLength = arr.length;
			// Run time : n/2
			for (int i = 0; i < arrLength / 2; i++) {
				int tempMax = arr[0];
				int tempMin = arr[0];
				if (arr[i] < arr[arrLength - 1]) {
					tempMax = arr[arrLength - 1];
					tempMin = arr[i];
				}
				max = (tempMax > max) ? tempMax : max;
				min = (tempMin < min) ? tempMin : min;
			}
		}
		if (arr.length % 2 == 1) {
			int arrLength = arr.length;
			max = (arr[arrLength / 2] > max) ? arr[arrLength / 2] : max;
			min = (arr[arrLength / 2] < min) ? arr[arrLength / 2] : min;
		}
	}

}
