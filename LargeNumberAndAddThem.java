package CrackCodeInterview;

// Design a system to store large numbers and a function to add them.
public class LargeNumberAndAddThem {
	Node head;
	int size = 0;

	public static void main(String[] args) {

	}

	public void addDigit(byte n) {
		Node newNode = new Node(n);
		if (head == null) {
			head = newNode;
			size++;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			size++;
		}
	}

	public int getSize() {
		return size;
	}

	public void addNumbers(LargeNumberAndAddThem aLrgNum) {
		if (aLrgNum.getSize() > this.getSize()) {

		}
	}

	class Node {
		byte digit;
		Node next;

		public Node(byte n) {
			digit = n;
		}
	}
}
