package CrackCodeInterview;

public class PrintLinkedListReverselyConstantSpace {
	public static void main(String[] args) {
		PrintLinkedListReverselyConstantSpace ans = new PrintLinkedListReverselyConstantSpace();
		ans.testProg();
	}

	public void testProg() {
		// TODO Auto-generated method stub
		LinkedList aList = new LinkedList();
		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(4);
		printLinkedListReversely(aList.head);
	}

	public static void printLinkedListReversely(LinkedList.Node pHead) {
		if (pHead == null || pHead.next == null) {
			return;
		}

		LinkedList.Node currentNode = pHead;
		LinkedList.Node nextCurr = pHead.next;
		currentNode.next = null;

		while (currentNode != null && nextCurr != null) {
			LinkedList.Node thirdNode = nextCurr.next;
			nextCurr.next = currentNode;
			currentNode = nextCurr;
			if (thirdNode != null) {
				nextCurr = thirdNode;
			} else {
				pHead = currentNode;
				break;
			}
		}

		while (pHead != null) {
			System.out.print(pHead.data + " ");
			pHead = pHead.next;
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
				Node current = head;
				while (current.next != null) {
					current = current.next;
				}
				current.next = newNode;
			}
		}

		class Node {
			Node next;
			int data;

			public Node(int n) {
				data = n;
			}
		}
	}
}
