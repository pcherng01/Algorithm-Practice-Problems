package CrackCodeInterview;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] anArr = { 5, 4, 7, 1, 10, 4, 6 };
		insertionSort(anArr);
		for (int i = 0; i < anArr.length; i++) {
			System.out.print(anArr[i] + " ");
		}
	}

	public static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i;
			while (j > 0 && temp < a[j - 1]) {
				int temp2 = a[j - 1];
				a[j - 1] = temp;
				a[j] = temp2;
				j--;
			}
		}
	}
}
