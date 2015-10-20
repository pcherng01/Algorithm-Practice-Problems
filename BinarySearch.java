package CrackCodeInterview;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(binarySearch(intArr, 3));
	}

	int[] data;
	int size;

	public boolean binarySearch(int key) {
		int low = 0;
		int high = size - 1;

		while (high >= low) {
			int middle = (low + high) / 2;
			if (data[middle] == key) {
				return true;
			}
			if (data[middle] < key) {
				low = middle + 1;
			}
			if (data[middle] > key) {
				high = middle - 1;
			}
		}
		return false;
	}

	public static int binarySearch(int[] pArr, int pNumToSearch) {
		int low = 0;
		int high = pArr.length - 1;

		while (low <= high) {
			int middleIndex = (high + low) / 2;
			if (pArr[middleIndex] == pNumToSearch) {
				return middleIndex;
			}
			if (pNumToSearch > pArr[middleIndex]) {
				low = middleIndex + 1;
			}
			if (pNumToSearch < pArr[middleIndex]) {
				high = middleIndex - 1;
			}
		}
		return -1;
	}

	public static int binarySearchz(int[] arrToSearch, int num) {
		int lowerBound = 0;
		int upperBound = arrToSearch.length - 1;
		// need the <= because once the lowerBound cursor move on the upper
		// we still need to look at that number, if it was < then it will not check
		// but once the lowerBound move past the upper, then it's done
		while (lowerBound <= upperBound) {
			int currIndex = (lowerBound + upperBound) / 2;
			if (arrToSearch[currIndex] < num) {
				lowerBound = currIndex + 1;
			}
			if (num < arrToSearch[currIndex]) {
				upperBound = currIndex - 1;
			} else
				return currIndex;
		}
		return -1;
	}

}
