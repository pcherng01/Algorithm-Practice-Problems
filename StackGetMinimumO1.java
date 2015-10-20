package CrackCodeInterview;


public class StackGetMinimumO1 {

	Node top;
	int size;

	public StackGetMinimumO1() {
		size = 0;
		top = null;
	}

	public void push(int n) {
		Node newNode = new Node(n);
		newNode.next = top;
		top = newNode;
	}

	public Node peek() {
		return top;
	}

	public Node pop() {
		Node removedNode = peek();
		top = removedNode.next;
		removedNode = null;
		return removedNode;
	}

	public int size() {

	}

	class Node {
		int data;
		Node next;

		public Node(int n) {
			data = n;
		}
	}
}
