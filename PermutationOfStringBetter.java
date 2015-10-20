package CrackCodeInterview;

public class PermutationOfStringBetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		long startTime = System.currentTimeMillis();
		permutationString("", "abcdef");
		long finishTime = System.currentTimeMillis();
		System.out.println("That took: " + (finishTime - startTime) + " ms");
		*/
		printPermutationsIterative("abc");
		/*
		String yolo = "Hello";
		String yolo2 = new String(yolo);
		yolo2 += "2";
		System.out.println(yolo);
		System.out.println(yolo2);*/
	}

	/**
	 * Print all the permutation of given string
	 */
	public static void permutationString(String prefix, String str) {
		if (str.length() == 0) {
			System.out.println(prefix);
		}
		int strLen = str.length();
		for (int i = 0; i < strLen; i++) {
			permutationString(prefix + str.charAt(i),
					str.substring(0, i) + str.substring(i + 1));
		}
	}

	public static void nonRecurFunc(String str) {
		for (int i = 0; i < str.length(); i++) {
			String pre = "" + str.charAt(i);
			String strString = str.substring(0, i) + str.substring(i + 1);
			String tempStr = new String(strString);
			String tempPre = new String(pre);
			int strStringLen = strString.length();
			int index = 0;
			while (index < strStringLen) {
				int innerIndex = 0;
				while (innerIndex < strStringLen) {

				}
				/*
				while (strString.length() > 0) {
					pre += strString.charAt(index);
					strString = strString.substring(0, index)
							+ strString.substring(index + 1);
				}
				System.out.println(pre);
				strString = new String(tempStr);
				pre = new String(tempPre);
				index++;*/
			}
		}
	}

	public static void printPermutationsIterative(String pString) {
		int[] factorials = new int[pString.length() + 1];
		factorials[0] = 1;
		for (int i = 1; i <= pString.length(); i++) {
			factorials[i] = factorials[i - 1] * i;
		}

		for (int i = 0; i < factorials[pString.length()]; i++) {
			String onePermutation = "";
			String temp = pString;
			int positionCode = i;
			for (int position = pString.length(); position > 0; position--) {
				int selected = positionCode / factorials[position - 1];
				onePermutation += temp.charAt(selected);
				positionCode = positionCode % factorials[position - 1];
				temp = temp.substring(0, selected)
						+ temp.substring(selected + 1);
			}
			System.out.println(onePermutation);
		}
	}

	public static void factLoop(String pString) {
		int len = 0;
		while (len < pString.length()) {
			for (int i = 0; i < pString.length(); i++) {

			}
			pString.substring(0, pString.length() - 1);
		}
	}

	// Not complete
	public static void permutationOfPhoneNumber(String prefix, String str) {
		if (str.length() == 0) {
			System.out.println(prefix);
		}
		int strLen = str.length();

	}
}
