package CrackCodeInterview;

import java.util.HashMap;

public class RemoveDuplicatesFromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void removeDupLinkedList(Node pNode) {
		HashMap<Integer, Boolean> aHash = new HashMap<Integer, Boolean>();
		Node previous = null;
		while (pNode != null) {
			if (aHash.containsKey(pNode.data)) {
				previous.next = pNode.next;
			} else {
				previous = pNode;
			}
			pNode = pNode.next;
		}
	}

	class Node {
		Node next;
		int data;

		public Node(int n) {
			next = null;
			data = n;
		}
	}
}
