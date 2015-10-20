package CrackCodeInterview;

public class LongestIncreasingSubsequenceArrayOofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestIncreasingSubsequenceArrayOofN ans = new LongestIncreasingSubsequenceArrayOofN();
		int[] arr = { 3, 4, -1, 0, 6, 2, 3 };
		System.out.println(ans.returnLIS(arr));
	}

	public int returnLIS(int[] arr) {
		int[] ans = new int[arr.length];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = 1;
		}

		int maxSequence = ans[0];
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					ans[i] = Math.max(ans[j] + 1, ans[i]);
					if (ans[i] > maxSequence) {
						maxSequence = ans[i];
					}
				}
			}
		}
		return maxSequence;
	}
}
