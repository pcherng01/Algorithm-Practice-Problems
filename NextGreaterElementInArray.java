package CrackCodeInterview;

import java.util.Stack;

public class NextGreaterElementInArray {
	public static void main(String[] args) {
		int[] anArr = { 4, 5, 2, 25 };
		printNextElement(anArr);

	}

	public static void printNextElement(int[] arr) {
		Stack<Integer> aStack = new Stack();
		for (int i = 0; i < arr.length; i++) {
			while (!aStack.isEmpty()) {
				int anInt = aStack.pop();
				if (anInt < arr[i]) {
					System.out.println(anInt + "-->" + arr[i]);
				} else {
					aStack.push(anInt);
					break;
				}
			}
			aStack.push(arr[i]);
		}
		System.out.println(aStack.pop() + "-->" + "-1");
	}
}
