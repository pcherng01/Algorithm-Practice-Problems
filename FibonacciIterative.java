package CrackCodeInterview;

public class FibonacciIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// n represent the ith starting with 0
	public static int returnFib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n < 3) {
			return 1;
		}

		int firstInt = 1;
		int secondInt = 2;
		int ans = 0;

		for (int i = 3; i <= n; i++) {
			ans = firstInt + secondInt;
			firstInt = secondInt;
			secondInt = ans;
		}
		return ans;
	}

	public static int recursiveFib(int n) {
		if (n < 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		} else
			return recursiveFib(n - 2) + recursiveFib(n - 1);
	}

	public static void fibDynamic(int n) {
		int[] ans = new int[n + 1];
		ans[0] = 0;
		ans[1] = 1;
		for (int i = 2; i <= n; i++) {
			ans[i] = ans[n - 1] + ans[n - 2];
		}
		System.out.println(ans[n]);
	}
}
