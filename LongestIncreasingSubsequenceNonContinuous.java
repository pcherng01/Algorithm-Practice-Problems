package CrackCodeInterview;

public class LongestIncreasingSubsequenceNonContinuous {

	/**
	 * Given {3,4,-1,0,6,2,3} --> -1,0,2,3 \n {2,5, 1,8,3} --> 2,5,8
	 * 
	 * @param arr
	 * @return
	 */

	public int longestSub(int arr[]) {
		int T[] = new int[arr.length];
		int actualSolution[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			T[i] = 1;
			actualSolution[i] = i;
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					T[i] = T[j] + 1;
					// Set the actual Solution to point to guy before me
					actualSolution[i] = j;
				}
			}
		}

		// Find the index of max number in T
		int maxIndex = 0;
		for (int i = 0; i < T.length; i++) {
			if (T[i] > T[maxIndex]) {
				maxIndex = i;
			}
		}

		// Lets print the actual solution
		int t = maxIndex;
		int newT = maxIndex;
		do {
			t = newT;
			System.out.print(arr[t] + " ");
			newT = actualSolution[t];
		} while (t != newT);
		System.out.println();
		return T[maxIndex];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
