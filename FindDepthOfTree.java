package CrackCodeInterview;

public class FindDepthOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class BinaryTree {
		Node root;

		public int depthOfTree(Node pRoot) {
			if (pRoot == null) {
				return 0;
			}
			int depthOfLeft = depthOfTree(pRoot.left);
			int depthOfRight = depthOfTree(pRoot.right);
			return (depthOfLeft > depthOfRight) ? (depthOfLeft + 1)
					: (depthOfRight + 1);
		}

		public int depthOfTree2(Node pRoot) {
			if (pRoot == null) {
				return 0;
			}
			int depthOfLeftTree = depthOfTree2(pRoot.left);
			int depthOfRightTree = depthOfTree2(pRoot.right);
			return (depthOfLeftTree > depthOfRightTree) ? (depthOfLeftTree + 1)
					: (depthOfRightTree + 1);
		}

		class Node {
			Node left;
			Node right;

			public Node() {
				left = null;
				right = null;
			}
		}
	}
}
