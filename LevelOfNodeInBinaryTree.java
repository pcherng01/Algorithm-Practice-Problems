package CrackCodeInterview;

public class LevelOfNodeInBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(3);
		root.left = new Node(5);
		root.right = new Node(2);
		root.left.right = new Node(1);
		root.left.left = new Node(4);
		int ans = getNodeLevel(root, 6);
		System.out.println(ans);
	}

	public static int getNodeLevel(Node pRoot, int num) {
		int level = 1;
		return utilFunc(pRoot, num, level);
	}

	public static int utilFunc(Node pRoot, int pNum, int pLevel) {
		if (pRoot == null) {
			return 0;
		}

		if (pRoot.data == pNum) {
			return (pLevel);
		}

		int leftNodeLevel = utilFunc(pRoot.left, pNum, pLevel + 1);
		if (leftNodeLevel != 0) {
			return leftNodeLevel;
		}

		int rightNodeLevel = utilFunc(pRoot.right, pNum, pLevel + 1);
		if (rightNodeLevel != 0) {
			return rightNodeLevel;
		}
		return 0;
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
