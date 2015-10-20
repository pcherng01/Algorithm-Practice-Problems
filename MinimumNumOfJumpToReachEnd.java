package CrackCodeInterview;

public class MinimumNumOfJumpToReachEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		printMinJump(arr);
	}

	public static void printMinJump(int[] arr) {
		int[] numOfJump = new int[arr.length];
		int[] indexJump = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int numJump = arr[i];

			for (int j = 1; j <= numJump; j++) {
				if (i + j > arr.length - 1) {
					break;
				}
				if (numOfJump[i + j] == 0) {
					numOfJump[i + j] = numOfJump[i] + 1;
					indexJump[i + j] = i;
				} else {
					if (numOfJump[i + j] <= (numOfJump[i] + 1)) {
						numOfJump[i + j] = numOfJump[i + j];
					} else {
						numOfJump[i + j] = numOfJump[i] + 1;
						indexJump[i + j] = i;
					}
				}
			}
		}
		int lastNum = indexJump[0];
		System.out.print(arr[indexJump[0]] + " -> ");
		for (int i = 1; i < indexJump.length; i++) {
			if (indexJump[i] != lastNum) {
				System.out.print(arr[indexJump[i]] + " -> ");
				lastNum = indexJump[i];
			}
		}
	}
}
