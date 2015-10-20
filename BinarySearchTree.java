package CrackCodeInterview;

public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public Node root;

	public void insert(int value) {
		Node node = new Node(value);

		if (root == null) {
			root = node;
			return;
		}

		insertNode(root, node);
	}

	private void insertNode(Node pRoot, Node pNewNode) {

		if (pNewNode.value < pRoot.value) {

			if (pRoot.left == null) {
				pRoot.left = pNewNode;
			} else {
				insertNode(pRoot.left, pNewNode);
			}
		} else {
			if (pRoot.right == null) {
				pRoot.right = pNewNode;
			} else {
				insertNode(pRoot.right, pNewNode);
			}
		}
	}

	public int findMinimum() {
		if (root == null) {
			return 0;
		}
		Node current = root;
		while (current.left != null) {
			current = current.left;
		}
		return current.value;
	}

	public int findMaximum() {
		if (root == null) {
			return 0;
		}
		Node current = root;
		while (current.right != null) {
			current = current.right;
		}
		return current.value;
	}

	public void printInOrder() {
		printInOrderRec(root);
		System.out.println("");
	}

	private void printInOrderRec(Node currentRoot) {
		if (currentRoot == null) {
			return;
		}

		printInOrderRec(currentRoot.left);
		System.out.print(currentRoot.value + " ");
		printInOrderRec(currentRoot.right);
	}

	public void printPreorder() {
		printPreOrderRec(root);
		System.out.println("");
	}

	private void printPreOrderRec(Node currentRoot) {
		if (currentRoot == null) {
			return;
		}

		System.out.print(currentRoot.value + " ");
		printPreOrderRec(currentRoot.left);
		printPreOrderRec(currentRoot.right);
	}

	public void printPostorder() {
		printPostOrderRec(root);
		System.out.println("");
	}

	private void printPostOrderRec(Node currentRoot) {
		if (currentRoot == null) {
			return;
		}
		printPostOrderRec(currentRoot.left);
		printPostOrderRec(currentRoot.right);
		System.out.print(currentRoot.value + "  ");
	}

	class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int n) {
			value = n;
			left = null;
			right = null;
		}
	}

}
