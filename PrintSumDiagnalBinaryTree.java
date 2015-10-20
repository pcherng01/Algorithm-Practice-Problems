package CrackCodeInterview;

import java.util.HashMap;
import java.util.Map;

public class PrintSumDiagnalBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(9);
		root.left.right = new Node(6);
		root.right.left = new Node(4);
		root.right.right = new Node(5);
		root.right.left.left = new Node(12);
		root.right.left.right = new Node(7);
		root.left.right.left = new Node(11);
		root.left.left.right = new Node(10);
		PrintSumDiagnalBinaryTree ans = new PrintSumDiagnalBinaryTree();
		ans.printDiagSum(root);
	}

	HashMap<Integer, Integer> aHM = new HashMap<Integer, Integer>();

	public void printDiagSum(Node pNode) {
		printDiag(0, pNode);
		for (Map.Entry<Integer, Integer> ans : aHM.entrySet()) {
			System.out.println(ans.getValue());
		}
	}

	public void printDiag(int diagnalNum, Node pNode) {
		if (pNode == null) {
			return;
		}

		// Check if HashMap does not have key already, if not, print it
		if (!aHM.containsKey(diagnalNum)) {
			aHM.put(diagnalNum, pNode.data);
		} else { // if contains key, put it back with the value added
			aHM.put(diagnalNum, aHM.get(diagnalNum) + pNode.data);
		}

		printDiag(diagnalNum, pNode.right);
		printDiag(diagnalNum + 1, pNode.left);
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