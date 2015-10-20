package CrackCodeInterview;

public class PrintAllPathsToLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node rootNode = new Node(40);
		Node node20 = new Node(20);
		Node node10 = new Node(10);
		Node node30 = new Node(30);
		Node node60 = new Node(60);
		Node node50 = new Node(50);
		Node node70 = new Node(70);
		Node node5 = new Node(5);
		Node node55 = new Node(55);

		rootNode.left = node20;
		rootNode.right = node60;

		node20.left = node10;
		node20.right = node30;

		node60.left = node50;
		node60.right = node70;
		node10.left = node5;
		node50.right = node55;
		printAllPathsToLeaf(rootNode, new int[1000], 0);
	}

	public static void printAllPathsToLeaf(Node node, int[] path, int len) {
		if (node == null) {
			return;
		}

		path[len] = node.data;
		len++;

		if (node.left == null && node.right == null) {
			// leaf node is reached
			printArray(path, len);
			return;
		}

		printAllPathsToLeaf(node.left, path, len);
		printAllPathsToLeaf(node.right, path, len);
	}

	public static void printArray(int[] path, int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(" " + path[i]);
		}
		System.out.println();
	}

	static class Node {
		Node left;
		Node right;
		int data;

		public Node(int n) {
			data = n;
		}
	}
}
