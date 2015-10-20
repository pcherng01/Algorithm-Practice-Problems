package CrackCodeInterview;

public class MergeTwoSortedArrayInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[7];
		arr1[0] = 1;
		arr1[1] = 3;
		arr1[2] = 6;
		arr1[3] = 7;
		int[] arr2 = { 2, 4, 10 };
		mergeTwoArray(arr1, arr2);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	/**
	 * Given 2 lists sorted in ascending orders (a[n] and b[n/2]) with the
	 * second half of the array a[] being empty, create a function that merges
	 * both arrays into a single sorted array
	 */
	public static void mergeTwoArray(int[] arr1, int[] arr2) {
		int arr1Index = (arr1.length / 2);
		int arr2Index = arr2.length - 1;
		int currentIndex = arr1.length - 1;

		while (arr1Index >= 0 && arr2Index >= 0) {
			int num1 = arr1[arr1Index];
			int num2 = arr2[arr2Index];

			if (num1 > num2) {
				arr1[currentIndex] = num1;
				currentIndex--;
				arr1Index--;
			} else {
				arr1[currentIndex] = num2;
				currentIndex--;
				arr2Index--;
			}
		}
	}
}
