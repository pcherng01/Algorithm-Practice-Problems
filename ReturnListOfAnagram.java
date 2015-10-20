package CrackCodeInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Given a list of strings, return a list of lists, where each list consists of words that
// are anagrams." Example: Given ["cab", "cz", "abc", "bca", "zc"] the output 
// should be: [["abc", "bca", "cab"], ["zc","cz"]]
public class ReturnListOfAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringList = { "cab", "cz", "abc", "bca", "zc" };
		printListOfAnagram(stringList);
	}

	public static void printListOfAnagram(String[] pList) {
		HashMap<String, ArrayList<String>> aHashMap = new HashMap<String, ArrayList<String>>();
		// Run thru the list
		for (int i = 0; i < pList.length; i++) {
			// unsorted string
			String currentString = pList[i];
			char[] charString = currentString.toCharArray();
			Arrays.sort(charString);
			// sorted string to be used as a key
			String mappedString = new String(charString);
			if (!aHashMap.containsKey(mappedString)) {
				ArrayList<String> anArrayList = new ArrayList<String>();
				anArrayList.add(currentString);
				aHashMap.put(mappedString, anArrayList);
			} else {
				ArrayList<String> anArrayList = aHashMap.get(mappedString);
				anArrayList.add(currentString);
				aHashMap.put(mappedString, anArrayList);
			}
		}
		for (Map.Entry<String, ArrayList<String>> entry : aHashMap.entrySet()) {
			ArrayList<String> anArrayList = entry.getValue();
			for (String str : anArrayList) {
				System.out.print(str + " ");
			}
			System.out.println();
		}

	}
}
