package CrackCodeInterview;

import java.util.NoSuchElementException;

public class implementingStackUsingLinkedList {
	private class Node {
		public Object data;
		public Node next;

		public Node(Object data, Node next) {
			this.data = data;
			this.next = next;
		}

		private Node top = null;

		public void push(Object item) {
			Node newNode = new Node(item, top);
			top.next = newNode;
			top = newNode;
		}

		public Node pop() {
			Node item = (Node) peek();
			top = item.next;
			return item;
		}

		public boolean isEmpty() {
			return top == null;
		}

		public Object peek() {
			if (top == null) {
				throw new NoSuchElementException();
			}
			return top;
		}

		public int size() {
			int count = 0;
			for (Node current = top; current != null; current = current.next) {
				count++;
			}
			return count++;
		}
	}
}
