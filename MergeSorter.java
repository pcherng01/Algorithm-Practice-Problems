package CrackCodeInterview;

import java.util.Arrays;

public class MergeSorter {

	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 4, 2, 6, 8, 9 };
		System.out.println(Arrays.toString(a));

		MergeSorter sorter = new MergeSorter(a);
		sorter.sort();
		System.out.println(Arrays.toString(a));
	}

	private int[] a;

	public MergeSorter(int[] anArray) {
		a = anArray;
	}

	public void sort() {
		if (a.length <= 1)
			return;
		int[] first = new int[a.length / 2];
		int[] second = new int[a.length - first.length];
		// Copy the first half of a into first, the second half into second
		for (int i = 0; i < first.length; i++) {
			first[i] = a[i];
		}
		for (int i = 0; i < second.length; i++) {
			second[i] = a[first.length + i];
		}
		MergeSorter firstSorter = new MergeSorter(first);
		MergeSorter secondSorter = new MergeSorter(second);
		firstSorter.sort();
		secondSorter.sort();
		merge(first, second);
	}

	// Merges two sorted arrays into the array managed by this merge sorter.
	private void merge(int[] first, int[] second) {
		int firstIndex = 0; // Next element to consider in the first array;
		int secondIndex = 0; // Next element to consider in the second array
		int j = 0; // next open position in a

		// As long as neither iFirst nor iSecond past the end, move the smaller element into a
		while (firstIndex < first.length && secondIndex < second.length) {
			if (first[firstIndex] < second[secondIndex]) {
				a[j] = first[firstIndex];
				firstIndex++;
			} else {
				a[j] = second[secondIndex];
				secondIndex++;
			}
			j++;
		}

		// Note that only one of the two loops below copie entries
		// Copy any remaining entries of the first array
		while (firstIndex < first.length) {
			a[j] = first[firstIndex];
			firstIndex++;
			j++;
		}

		// Copy any remaining entries of the second half
		while (secondIndex < second.length) {
			a[j] = second[secondIndex];
			secondIndex++;
			j++;
		}
	}
}
