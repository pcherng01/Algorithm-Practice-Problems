package CrackCodeInterview;

public class MaximumWidthBinaryTree {

	/**
	 * Given binary tree, find the max width of the tree so for example, 1 2 3 4
	 * 5 8 6 7 --> return level 3 with width of 3
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumWidthBinaryTree ans = new MaximumWidthBinaryTree();
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right = new Node(3);
		root.right.right = new Node(8);
		root.right.right.left = new Node(6);
		root.right.right.left = new Node(7);
		System.out.println(ans.heightOfTree(root));
		ans.findMax(root);
	}

	int[] ans;

	public void findMax(Node pNode) {
		ans = new int[heightOfTree(pNode)];
		findMaxWidth(pNode, 0);
		int maxWidth = ans[0];
		int maxLevel = 0;
		for (int i = 0; i < ans.length; i++) {
			if (ans[i] > maxWidth) {
				maxWidth = ans[i];
				maxLevel = i;
			}
		}
		System.out.println("Max width of " + maxWidth + " at level"
				+ (maxLevel + 1));
	}

	public void findMaxWidth(Node pNode, int level) {
		if (pNode == null) {
			return;
		} else {
			ans[level] += 1;
			findMaxWidth(pNode.left, level + 1);
			findMaxWidth(pNode.right, level + 1);
		}
	}

	public int heightOfTree(Node pNode) {

		if (pNode == null) {
			return 0;
		}

		int leftHeight = heightOfTree(pNode.left);
		int rightHeight = heightOfTree(pNode.right);
		return (leftHeight > rightHeight) ? leftHeight + 1 : rightHeight + 1;

	}
}
