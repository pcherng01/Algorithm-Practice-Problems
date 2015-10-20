package CrackCodeInterview;

public class LCABinaryTreeRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		System.out.println(findLCA(root, 4, 6).data);
	}

	public static Node findLCA(Node pRoot, int num1, int num2) {
		if (pRoot == null) {
			return null;
		}

		if (pRoot.data == num1) {
			return pRoot;
		}
		if (pRoot.data == num2) {
			return pRoot;
		}

		Node lcaLeft = findLCA(pRoot.left, num1, num2);
		Node lcaRight = findLCA(pRoot.right, num1, num2);

		if ((lcaLeft != null) && (lcaRight != null)) {
			return pRoot;
		}

		return (lcaLeft != null) ? lcaLeft : lcaRight;

	}

	static class Node {
		Node left;
		Node right;
		int data;

		public Node(int pData) {
			left = null;
			right = null;
			data = pData;
		}
	}
}
