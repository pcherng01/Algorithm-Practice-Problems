package CrackCodeInterview;

import java.util.ArrayList;

public class PrintLeastStringCombination {

	ArrayList<String> arrString = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintLeastStringCombination ans = new PrintLeastStringCombination();
		ans.printString(3);
	}

	public PrintLeastStringCombination() {

	}

	public void printString(int n) {
		String strNum = "";
		for (int i = 1; i <= n; i++) {
			strNum += "" + i;
		}
		addStringPerm("", strNum);

		int[][] matrix = new int[arrString.size()][arrString.size() + 1];
		for (int row = 0; row < matrix.length; row++) {
			String rowStr = arrString.get(row);
			for (int col = 0; col < matrix.length; col++) {
				if (col == 0) {
					matrix[row][col] = 0;
				} else {
					String colStr = arrString.get(col - 1);
					if (rowStr.contains(colStr)) {
						matrix[row][col] = rowStr.length();
					} else {
						// j represents the index of colStr, decrease each time 
						int j = colStr.length() - 1;
						for (int i = (rowStr.length() - (n - 1)); i < rowStr
								.length(); i++) {
							if (colStr.startsWith(rowStr.substring(i))) {
								break;
							}
							j--;
						}
						rowStr += colStr.substring(j);
						matrix[row][col] = matrix[row][col - 1]
								+ colStr.substring(j).length();
					}
				}
			}
			System.out.println("Row " + row + ", string: " + rowStr);
		}
		int minLen = matrix[0][matrix.length - 1];
		String answer = "";
		for (int row = 0; row < matrix.length; row++) {
			if (matrix[row][matrix.length - 1] < minLen) {
				minLen = matrix[row][matrix.length - 1];
			}
		}
		System.out.println(minLen);
	}

	public void addStringPerm(String pre, String str) {
		if (str.length() == 0) {
			arrString.add(pre);
			System.out.println(pre);
		}
		int strLen = str.length();
		for (int i = 0; i < strLen; i++) {
			addStringPerm(pre + str.charAt(i),
					str.substring(0, i) + str.substring(i + 1));
		}
	}
}
