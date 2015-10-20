package CrackCodeInterview;

import java.util.Stack;

public class StackSetEvaluationPostFixExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aStr = "2 3 1 * + 9 -";
		Stack<Integer> aStack = new Stack<Integer>();
		char[] charArr = aStr.replaceAll(" ", "").toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (Character.isDigit(charArr[i])) {
				aStack.push(Integer.parseInt("" + charArr[i]));
			} else {
				int val1 = aStack.pop();
				int val2 = aStack.pop();
				int evaluate = 0;
				switch (charArr[i]) {
				case '+':
					evaluate = val1 + val2;
					break;
				case '-':
					evaluate = val1 - val2;
					break;
				case '*':
					evaluate = val1 * val2;
					break;
				case '/':
					evaluate = val1 / val2;
					break;
				}
				aStack.push(evaluate);
			}
		}
		System.out.println("Answer: " + aStack.pop());
	}

}
