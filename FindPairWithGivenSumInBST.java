package CrackCodeInterview;

import java.util.HashMap;

public class FindPairWithGivenSumInBST {

	// Given BST, find pair that adds up to sum
	/*
	15
	/     \
	10      20     ----> return 8 + 25 = 33
	/ \     /  \
	8  12   16  25    */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(2);
		root.left = new Node(10);
		root.left.left = new Node(16);
		root.left.right = new Node(25);
		root.right = new Node(20);
		root.right.left = new Node(8);
		root.right.right = new Node(15);

		FindPairWithGivenSumInBST ans = new FindPairWithGivenSumInBST();
		ans.printPairSum(root, 33);
	}

	HashMap<Integer, Integer> aHM = new HashMap<Integer, Integer>();

	public void printPairSum(Node pNode, int sum) {
		if (pNode == null) {
			return;
		}

		aHM.put(pNode.data, sum - pNode.data);
		if (aHM.containsKey(sum - pNode.data)) {
			System.out.println((sum - pNode.data + " " + aHM.get(sum
					- pNode.data)));
			return;
		}

		printPairSum(pNode.left, sum);
		printPairSum(pNode.right, sum);
	}

}

class Node {
	Node left;
	Node right;
	int data;

	public Node(int n) {
		data = n;
	}
}
