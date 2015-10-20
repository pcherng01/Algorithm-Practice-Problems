package CrackCodeInterview;

public class CheckIfTreeIsBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValidBST(Node pRoot, int MIN, int MAX) {
		if (pRoot == null) {
			return true;
		}
		if (pRoot.data > MIN && pRoot.data < MAX
				&& isValidBST(pRoot.left, MIN, pRoot.data)
				&& isValidBST(pRoot.right, pRoot.data, MAX)) {
			return true;
		} else
			return false;
	}

	/*
	public static boolean isBST(Node pRoot) {
		if(pRoot == null) {
			return false;
		}
		else {
			return isBST2(pRoot, pRoot.data, pRoot.data);
		}
	}
	
	
	public static boolean isBST2(Node pRoot, int minVal, int maxVal) {
		if(pRoot == null) {
			return false;
		}
		if((pRoot.left != null) && (pRoot.left.data < maxVal)) {
			isBST2(pRoot.left, minVal, pRoot.data);
		}
		if ((pRoot.right != null) && (pRoot.right.data > minVal)) {
			isBST2(pRoot.right, pRoot.data, maxVal);
		}
		
		
		return false;
	}*/

	// the left child cannot be greater than it's root(MAX)
	// similarly right child cannot be less than its root(MIN)

	class Node {
		Node left;
		Node right;
		int data;

		public Node(int n) {
			data = n;
		}
	}
}
