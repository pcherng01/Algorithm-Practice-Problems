package CrackCodeInterview;

/**
 * The cost of a stock on each day is given in an array, find the max profit you
 * can make by buying and selling in those days. If the given array is
 * {100,180,260,310,40,535, 695} Profit can earned by buying on day 0, selling
 * on day 3. Again buy on day 4 and sell on day 6. If the given array of prices
 * is sorted in decreasing order, then profit cannot be earned at all.
 * 
 * @author LeafCherngchaosil
 *
 */
public class StockBuySellToMaximizeProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] anArray = { 100, 180, 260, 310, 40, 535, 695 };
		maximizeProfit(anArray);
	}

	// Basically find the max and min (local)
	public static void maximizeProfit(int[] arr) {
		int maxDifferent = arr[1] - arr[0];
		int minElement = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - minElement > maxDifferent) {
				maxDifferent = arr[i] - minElement;
			}
			if (minElement > arr[i]) {
				minElement = arr[i];
			}
		}
		System.out.println("Maximum Profit: " + maxDifferent);

	}
}
