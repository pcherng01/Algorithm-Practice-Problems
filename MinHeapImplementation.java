package CrackCodeInterview;

public class MinHeapImplementation {
	private int[] Heap;
	private int size;
	private int maxSize;

	private static final int FRONT = 1;

	public MinHeapImplementation(int maxsize) {
		this.maxSize = maxsize;
		this.size = 0;
		Heap = new int[this.maxSize + 1];
		Heap[0] = Integer.MIN_VALUE;
	}

	private int parent(int pos) {
		return pos / 2;
	}

	private int leftChild(int pos) {
		return (2 * pos);
	}

	private int rightChild(int pos) {
		return (2 * pos) + 1;
	}

	private boolean isLeaf(int pos) {
		if (pos >= (size / 2) && pos <= size) {
			return true;
		}
		return false;
	}

	private void swap(int fpos, int spos) {
		int temp;
		temp = Heap[fpos];
		Heap[fpos] = Heap[spos];
		Heap[spos] = temp;
	}

	private void minHeapify(int pos) {
		if (!isLeaf(pos)) {
			if (Heap[pos] > Heap[leftChild(pos)]
					|| Heap[pos] > Heap[rightChild(pos)]) {
				if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) {
					swap(pos, leftChild(pos));
					minHeapify(leftChild(pos));
				} else {
					swap(pos, rightChild(pos));
					minHeapify(rightChild(pos));
				}
			}
		}
	}

	public void insert(int element) {
		Heap[++size] = element;
		int current = size;

		while (Heap[current] < Heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	public void print() {
		for (int i = 1; i <= size / 2; i++) {

		}
	}
}