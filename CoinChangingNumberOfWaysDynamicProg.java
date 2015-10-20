package CrackCodeInterview;

public class CoinChangingNumberOfWaysDynamicProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] anInt = { 1, 2, 3 };
		numWaysComb(anInt, 5);
	}

	public static void numWaysComb(int[] arr, int totalSum) {
		int[][] matrix = new int[arr.length + 1][totalSum + 1];

		for (int i = 0; i < matrix[0].length; i++) {
			matrix[0][i] = 0;
		}
		for (int i = 1; i < matrix.length; i++) {
			matrix[i][0] = 1;
		}

		for (int row = 1; row < matrix.length; row++) {
			for (int col = 1; col < matrix[0].length; col++) {
				if (row <= col) {
					matrix[row][col] = matrix[row - 1][col]
							+ matrix[row][col - row];
				} else if (row > col) {
					matrix[row][col] = matrix[row - 1][col];
				}
			}
		}
		System.out
				.println("Total num of ways: " + matrix[arr.length][totalSum]);
	}
}
