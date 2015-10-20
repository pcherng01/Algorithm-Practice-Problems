package CrackCodeInterview;

import java.util.ArrayList;

public class RootToLeafSumBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	ArrayList<Integer> arrList = new ArrayList<Integer>();

	public boolean printSumLeafToRoot(Node pNode, int sum) {

		if (pNode == null) {
			return false;
		}

		if (pNode.left == null && pNode.right == null) {
			if (pNode.data == sum) {
				arrList.add(pNode.data);
				return true;
			}
			return false;
		}

		if (printSumLeafToRoot(pNode.left, sum - pNode.data)) {
			arrList.add(pNode.data);
			return true;
		}
		if (printSumLeafToRoot(pNode.right, sum - pNode.data)) {
			arrList.add(pNode.data);
			return true;
		}

		return false;
	}

	class Node {
		Node left;
		Node right;
		int data;

		public Node(int n) {
			data = n;
		}
	}
}
