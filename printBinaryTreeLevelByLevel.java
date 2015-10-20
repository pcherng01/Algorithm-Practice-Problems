package CrackCodeInterview;

import java.util.LinkedList;
import java.util.Queue;

public class printBinaryTreeLevelByLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void printLevelByLevel(Node pRoot) {
		Queue<Node> currentLevel = new LinkedList();
		Queue<Node> nextLevel = new LinkedList();
		if (pRoot == null) {
			return;
		}
		currentLevel.add(pRoot);

		while (!currentLevel.isEmpty()) {
			Node currentNode = currentLevel.remove();
			if (currentNode != null) {
				System.out.print(currentNode + " ");
				nextLevel.add(currentNode.left);
				nextLevel.add(currentNode.right);
			}
			if (currentLevel.isEmpty()) {
				System.out.println();
				while (!nextLevel.isEmpty()) {
					currentLevel.add(nextLevel.remove());
				}
			}
		}

	}

	class Node {
		int data;
		Node left;
		Node right;

		public Node() {
			left = null;
			right = null;
			data = 0;
		}
	}
}
