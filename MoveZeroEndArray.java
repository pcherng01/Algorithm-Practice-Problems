package CrackCodeInterview;

public class MoveZeroEndArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = { 0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0 };
		moveZeroToEndArray(intArr);
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
	}

	public static void moveZeroToEndArray(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				swapEleArr(arr, i, count);
				count++;
			}
		}
	}

	public static void swapEleArr(int[] arr, int i, int f) {
		int temp = arr[i];
		arr[i] = arr[f];
		arr[f] = temp;
	}
}
