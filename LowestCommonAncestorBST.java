package CrackCodeInterview;

public class LowestCommonAncestorBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Node LCA(Node pRoot, int v1, int v2) {
		if (pRoot == null) {
			return null;
		}
		if (v1 > pRoot.data && v2 > pRoot.data) {
			LCA(pRoot.right, v1, v2);
		} else if (v1 < pRoot.data && v2 < pRoot.data) {
			LCA(pRoot.left, v1, v2);
		} else
			return pRoot;
		return null;
	}

	class Node {
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
