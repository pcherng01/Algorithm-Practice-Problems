package CrackCodeInterview;

import java.util.Arrays;

/**
 * Given a number n, find the smallest number that has same set of digits as n
 * and is greater than n. If x is the greatest possible number with its set of
 * digits, then print “not possible”.
 * 
 * @author LeafCherngchaosil
 *
 */
public class SecondLargeNumAfterNDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(secondLargest(534976));
	}

	public static String secondLargest(int n) {

		String number = "" + n;
		// Put each digit in the array
		int[] numbersArr = new int[number.length()];
		for (int i = 0; i < numbersArr.length; i++) {
			numbersArr[i] = Integer.parseInt("" + number.charAt(i));
		}

		int length = numbersArr.length;
		// Looping starting from the right to left
		for (int i = length - 1; i > 0; i--) {
			// Stop when the leftNum < rightNum so like 1234
			if (numbersArr[i] > numbersArr[i - 1]) {
				int smallest = numbersArr[i - 1];
				int startingPoint = i;

				int secondSmallIndex = i;
				int secondSmallest = numbersArr[i];
				// Find the smallest number that is greater than the pivot number
				for (int k = i; k < length; k++) {
					if (numbersArr[k] > smallest
							&& numbersArr[k] < secondSmallest) {
						secondSmallest = numbersArr[k];
						secondSmallIndex = k;
					}
				}

				// swap the pivot number with the smallest number right of pivot
				int temp = smallest;
				numbersArr[i - 1] = secondSmallest;
				numbersArr[secondSmallIndex] = temp;

				// Sort the number right of pivot to get the smallest num as possible
				Arrays.sort(numbersArr, i, length);

				// Put the array as string and parses it as an int
				String ans = "";
				for (int ii : numbersArr) {
					ans += ii;
				}
				int theNum = Integer.parseInt(ans);
				return ans;
			}

		}

		return "Not possible";
	}
}
