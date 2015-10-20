package CrackCodeInterview;

public class PrintAllPermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder st = new StringBuilder("abc");
		permute(st, 0);
	}

	public static void permute(StringBuilder pString, int left) {

		if (left == pString.length() - 1) {
			System.out.println(pString);
		} else {
			for (int i = left; i < pString.length(); i++) {
				swap(left, i, pString);
				permute(pString, left + 1);
				swap(left, i, pString);
			}
		}
	}

	/**
	 * Swapping character given StringBuilder ---> "abc" -- > "cba"
	 * 
	 * @param firstIndex
	 * @param secondIndex
	 * @param aSB
	 */
	public static void swap(int firstIndex, int secondIndex, StringBuilder aSB) {
		char aChar = aSB.charAt(firstIndex); //a
		aSB.setCharAt(firstIndex, aSB.charAt(secondIndex));
		aSB.setCharAt(secondIndex, aChar);
	}
}
