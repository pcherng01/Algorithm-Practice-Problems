package CrackCodeInterview;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] aChar = "abaacd".toCharArray();
		removeDup(aChar);
		System.out.println(aChar);

		LinkedHashMap<String, Integer> lhm = new LinkedHashMap();
		lhm.put("Yolo", 123);
		lhm.put("Swag", 1234);
		lhm.put("YORO", 12345);
		for (Map.Entry<String, Integer> ans : lhm.entrySet()) {
			System.out.println(ans.getKey() + " " + ans.getValue());
		}
	}

	public static void removeDup(char[] str) {
		if (str == null)
			return;
		int len = str.length;
		if (len < 2)
			return;

		int tail = 1;

		for (int i = 1; i < len; ++i) {
			int j;
			for (j = 0; j < tail; ++j) {
				if (str[i] == str[j])
					break;
			}
			if (j == tail) {
				str[tail] = str[i];
				++tail;
			}
		}
		str[tail] = 0;
	}

	public static boolean isPalindrome(String input1, String input2) {
		if (input1.length() != input2.length()) {
			return false;
		}
		int forwardIter = 0;
		int backwardIter = input2.length() - 1;
		while (!(forwardIter > input1.length() - 1) || !(backwardIter < 0)) {
			if (input1.charAt(forwardIter) != input2.charAt(backwardIter))
				return false;
			forwardIter++;
			backwardIter--;
		}
		return true;
	}
}
