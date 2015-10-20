package CrackCodeInterview;

public class PrintLinkedListReverseRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// O(n) time but linear space because it stacks up
	public static void printLinkedList(Node pHead) {
		if (pHead == null) {
			return;
		}
		if (pHead != null) {
			printLinkedList(pHead.next);
			System.out.print(pHead.data + " ");
		}
	}

	class LinkedList {
		Node head;

		public LinkedList() {
			head = null;
		}

		public void add(int n) {
			Node newNode = new Node(n);
			if (head == null) {
				head = newNode;
			} else {

			}
		}
	}

	class Node {
		Node next;
		int data;

		public Node(int n) {
			data = n;
			next = null;
		}
	}
}
