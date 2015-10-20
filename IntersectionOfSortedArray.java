package CrackCodeInterview;

import java.util.ArrayList;

public class IntersectionOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	ArrayList<Integer> aList = new ArrayList<Integer>();

	public void getIntersection(int[] firstArr, int[] secondArr) {
		int firstIndex = 0;
		int secondIndex = 0;

		while (firstIndex != firstArr.length || secondIndex != secondArr.length) {
			if (firstArr[firstIndex] == secondArr[secondIndex]) {
				aList.add(firstArr[firstIndex]);
			}
			if (firstArr[firstIndex] > secondArr[secondIndex]) {
				secondIndex++;
			} else {
				firstIndex++;
			}
		}
	}
}
