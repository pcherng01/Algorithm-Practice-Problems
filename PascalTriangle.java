package CrackCodeInterview;

// Print out the pascal triangle
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPascalTriangle(5);
	}

	// n represents the nth column start with 1
	public static void printPascalTriangle(int n) {
		int[] previousRow = { 1 };
		int[] currentRow;
		printArr(previousRow);

		for (int i = 2; i <= n; i++) {
			currentRow = new int[i];
			currentRow[0] = 1;
			currentRow[i - 1] = 1;
			for (int p = 0; p < (i - 2); p++) {
				currentRow[p + 1] = previousRow[p] + previousRow[p + 1];
			}
			previousRow = currentRow;
			printArr(currentRow);
		}
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
