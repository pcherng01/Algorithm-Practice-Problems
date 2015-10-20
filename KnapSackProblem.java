package CrackCodeInterview;

public class KnapSackProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int returnMax(int[] arr, int[] val) {
		int[][] matrix = new int[arr.length][arr.length + 1];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				if (col == 0) {
					matrix[row][col] = 0;
				}
				if (arr[row] > col) {
					matrix[row][col] = matrix[row - 1][col];
				} else {
					matrix[row][col] = Math.max(matrix[row - 1][col], val[row]
							+ matrix[row - 1][col - arr[row]]);
				}
			}
		}
		return matrix[matrix.length - 1][matrix.length - 1];
	}
}
