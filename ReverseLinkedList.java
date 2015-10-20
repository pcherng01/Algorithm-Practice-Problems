package CrackCodeInterview;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void reverseLinkedList(Node pHead) {
		// If head is empty, then end the function
		if (pHead == null || pHead.next == null) {
			return;
		}

		Node currentNode = pHead;
		Node nextCurr = pHead.next;
		currentNode.next = null;

		while (currentNode != null && nextCurr != null) {
			Node thirdNode = nextCurr.next;
			nextCurr.next = currentNode;
			currentNode = nextCurr;
			if (thirdNode != null) {
				nextCurr = thirdNode;
			} else {
				break;
			}
		}
	}

	class Node {
		public Node next;
	}
}
