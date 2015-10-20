package CrackCodeInterview;

public class MyOwnMergeSort {

	int[] mArray;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 2, 4, 7, 3 };
		MyOwnMergeSort mergeSort = new MyOwnMergeSort(intArray);
		mergeSort.mergeSort();
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}

	public MyOwnMergeSort(int[] pIntArray) {
		mArray = pIntArray;
	}

	public void mergeSort() {

		if (mArray.length <= 1) {
			return;
		}
		int[] firstHalfArray = new int[mArray.length / 2];
		int[] secondHalfArray = new int[mArray.length - firstHalfArray.length];

		for (int i = 0; i < firstHalfArray.length; i++) {
			firstHalfArray[i] = mArray[i];
		}
		for (int i = 0; i < secondHalfArray.length; i++) {
			secondHalfArray[i] = mArray[firstHalfArray.length + i];
		}

		MyOwnMergeSort first = new MyOwnMergeSort(firstHalfArray);
		MyOwnMergeSort second = new MyOwnMergeSort(secondHalfArray);
		first.mergeSort();
		second.mergeSort();
		mergeBoth(first.mArray, second.mArray);
	}

	public void mergeBoth(int[] pFirst, int[] pSecond) {
		int firstIndex = 0;
		int secondIndex = 0;
		int mArrIndex = 0;

		while (firstIndex < pFirst.length && secondIndex < pSecond.length) {
			if (pFirst[firstIndex] < pSecond[secondIndex]) {
				mArray[mArrIndex] = pFirst[firstIndex];
				firstIndex++;
			} else {
				mArray[mArrIndex] = pSecond[secondIndex];
				secondIndex++;
			}
			mArrIndex++;
		}

		// Copy the remaining of each array into the mArray
		while (firstIndex < pFirst.length) {
			mArray[mArrIndex] = pFirst[firstIndex];
			firstIndex++;
			mArrIndex++;
		}

		while (secondIndex < pSecond.length) {
			mArray[mArrIndex] = pSecond[secondIndex];
			secondIndex++;
			mArrIndex++;
		}
	}

}
