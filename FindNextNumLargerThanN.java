package CrackCodeInterview;

import java.util.Arrays;

public class FindNextNumLargerThanN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(returnNextSmallInt(583555));
	}

	/**
	 * We want t find the number greater than the element we're running thru to
	 * swap for putting in smaller number in that place.
	 * 
	 * Find num second larger than the pivot number then Sort in descending
	 * order
	 * 
	 * @param n
	 * @return
	 */
	public static String returnNextLargerN(int n) {

		// Convert int to array of ints
		String number = "" + n;
		int arrLength = number.length();
		int[] digitsArr = new int[number.length()];
		for (int i = 0; i < number.length(); i++) {
			digitsArr[i] = Integer.parseInt("" + number.charAt(i));
		}

		// Loop thru digits starting from the right-end
		for (int i = arrLength - 1; i > 0; i--) {
			int rightElement = digitsArr[i];
			int leftElement = digitsArr[i - 1];
			// Stop when right element is greater than left element
			if (leftElement < rightElement) {
				// Start algorithm here
				int pivotIndex = i - 1;
				int rightOfPivotIndex = i;
				int pivotNum = digitsArr[pivotIndex];
				int smallestNum = digitsArr[rightOfPivotIndex];
				int smallestIndex = rightOfPivotIndex;

				// Finding the largest number that is less than pivot number
				// starting at the index next to pivot index
				for (int k = rightOfPivotIndex; k < arrLength; k++) {
					if (digitsArr[k] > smallestNum && digitsArr[k] < pivotNum) {
						smallestNum = digitsArr[k];
						smallestIndex = k;
					}
				}

				// Find the number is found, swap it with the pivot number
				//swapNumInArray(pivotIndex, smallestIndex, digitsArr);
				Arrays.sort(digitsArr, rightOfPivotIndex, arrLength);

				// Sort the right part of Array, put the descending order in string
				String rightPart = "";
				for (int p = arrLength - 1; p >= rightOfPivotIndex; p--) {
					rightPart += digitsArr[p];
				}

				String ans = "";
				for (int j = 0; j <= pivotIndex; j++) {
					ans += digitsArr[j];
				}

				return "" + Integer.parseInt(ans + rightPart);
			}
		}
		return "Not possible";
	}

	public static String returnNextSmallInt(int n) {
		String str = "" + n;
		char[] charArr = str.toCharArray();
		for (int i = charArr.length - 1; i > 0; i--) {
			if (charArr[i - 1] > charArr[i]) {
				int pivot = i - 1;
				// Need to run thru the loop starting fro right of pivot
				// Find the greatest num less than pivot num
				int maxNum = charArr[pivot];
				int maxNumIndex = i;
				for (int j = i; j < str.length(); j++) {
					if (str.charAt(j) > maxNum && str.charAt(j) < maxNum) {
						maxNum = str.charAt(j);
						maxNumIndex = j;
					}
				}
				swapNumInArray(pivot, maxNumIndex, charArr);
				Arrays.sort(charArr, i, charArr.length);
				String ans = charArr.toString();

				String firstPart = ans.substring(0, i);
				String secondPart = "";
				for (int k = charArr.length - 1; k > pivot; k--) {
					secondPart = secondPart + charArr[k];
				}
				String ansz = firstPart + secondPart;
				return ansz;
			}
		}
		return "Not possible";
	}

	public static void swapNumInArray(int firstIndex, int secondIndex,
			char[] pArr) {
		int temp = pArr[firstIndex];
		pArr[firstIndex] = pArr[secondIndex];
		pArr[secondIndex] = (char) temp;
	}

}
