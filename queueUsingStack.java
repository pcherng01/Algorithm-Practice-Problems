package CrackCodeInterview;

import java.util.Stack;

public class queueUsingStack {

	private Stack<Object> stack1;
	private Stack<Object> stack2;

	public queueUsingStack() {
		stack1 = new Stack<Object>();
		stack2 = new Stack<Object>();
	}

	private void moveStack1ToStack2() {
		while (stack1.isEmpty()) {
			Object poppedItem = stack1.pop();
			stack2.push(poppedItem);
		}
	}

	public boolean isEmpty() {
		return (stack1.isEmpty() && stack2.isEmpty());
	}

	public Object peek() {
		moveStack1ToStack2();
		return stack2.peek();
	}

	public void enqueue(Object mObject) {
		stack1.push(mObject);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
