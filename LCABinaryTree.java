package CrackCodeInterview;

import java.util.ArrayList;

public class LCABinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		System.out.println(findLCA(root, 4, 6));
	}

	// O(n)
	public static boolean hasLCA(Node pRoot, ArrayList<Integer> arr, int num) {

		if (pRoot == null) {
			return false;
		}

		arr.add(pRoot.data);
		if (pRoot.data == num) {
			return true;
		}

		if ((pRoot.left != null) && (hasLCA(pRoot.left, arr, num))
				|| ((pRoot.right != null) && (hasLCA(pRoot.right, arr, num)))) {
			return true;
		}

		arr.remove(arr.size() - 1);
		return false;
	}

	public static int findLCA(Node pRoot, int num1, int num2) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();

		if (!hasLCA(pRoot, arr1, num1) || !hasLCA(pRoot, arr2, num2)) {
			return -1;
		}

		int i = 0;
		for (i = 0; i < arr1.size() && i < arr2.size(); i++) {
			if (arr1.get(i) != arr2.get(i)) {
				break;
			}
		}
		return arr1.get(i - 1);
	}

	static class Node {
		Node left;
		Node right;
		int data;

		public Node(int n) {
			left = null;
			right = null;
			data = n;
		}
	}
}
