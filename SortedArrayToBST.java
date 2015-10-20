package CrackCodeInterview;

public class SortedArrayToBST {

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int n) {
			data = n;
		}
	}

	public static void main(String[] args) {
		int[] sortedArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		SortedArrayToBST ans = new SortedArrayToBST();
		ans.sortedArrayToBST(sortedArr);

	}

	public void inOrderTraversal(Node pNode) {

	}

	public Node sortedArrayToBST(int[] arr) {
		if (arr.length == 0) {
			return null;
		}
		return sortedArrayToBST(arr, 0, arr.length - 1);

	}

	public Node sortedArrayToBST(int[] arr, int startIndex, int endIndex) {
		if (startIndex > endIndex) {
			return null;
		}

		int middleIndex = (startIndex + endIndex) / 2;
		Node root = new Node(arr[middleIndex]);
		root.left = sortedArrayToBST(arr, startIndex, middleIndex - 1);
		root.right = sortedArrayToBST(arr, middleIndex + 1, endIndex);
		return root;
	}
}
