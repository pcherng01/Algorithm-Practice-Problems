package CrackCodeInterview;

import java.util.ArrayList;

public class PrintSubsetOfString {

	public static void main(String[] args) {
		//printSubsetString("aaa");
		perm("abc", "", 0);
	}

	public static void printSubsetString(String pString) {
		for (int i = 0; i < pString.length(); i++) {
			ArrayList<Character> tempList = new ArrayList<Character>();
			tempList.add(pString.charAt(i));
			for (Character c : tempList) {
				System.out.println(c);
			}
			for (int j = i + 1; j < pString.length(); j++) {
				tempList.add(pString.charAt(j));
				for (Character c : tempList) {
					System.out.print(c);
				}
				System.out.println();
			}
		}
	}

	/**
	 * First perm "abc" calls
	 * 
	 * 
	 * @param str1
	 * @param added
	 * @param k
	 */
	public static void perm(String str1, String added, int k) {
		if (added.length() > 0) {
			System.out.println(added);
		}
		for (int i = k; i < str1.length(); i++) {
			perm(str1, added + str1.charAt(i), i + 1);
		}
	}
	/**
	 * "abc", "",0) ----> - i = 0; i < 3; i++ perm("abc","a",1)------> i = 1; i
	 * < 3; i++ perm("abc","ab",2) -----> i =2; i < 3; i++ perm("abc","abc",3);
	 * perm("abc","ac",3)
	 *
	 * perm("abc","b",2)------>i = 2; i < 3; i++ perm("abc","bc",3) ----> i = 3;
	 * i < 3; i++ perm("abc","c",3)
	 */
}
