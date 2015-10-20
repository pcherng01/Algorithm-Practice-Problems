package CrackCodeInterview;

public class ComputeSumOfTwoNumbersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfTwo("19999999999999999999999999999999",
				"1999999999999999999999999999"));
	}

	// Return the sum of two numbers in form of string
	// ("123,"30") ---> ("153")
	// this function assumes str1.length > str2.length
	public static String returnSumOfTwo(String str1, String str2) {
		int carry = 0;
		int str1Len = str1.length();
		int str2Len = str2.length();
		int smallerIndexCounter = 0;
		StringBuilder strAns = new StringBuilder();

		// if str1 length is grteater than looop thru it
		if (str1Len >= str2Len) {
			smallerIndexCounter = str2Len - 1;
			for (int i = str1Len - 1; i >= 0; i--) {
				int int1 = Integer.parseInt("" + str1.charAt(i));
				int int2 = (smallerIndexCounter >= 0) ? Integer.parseInt(""
						+ str2.charAt(smallerIndexCounter)) : 0;
				smallerIndexCounter--;
				int sum = int1 + int2 + carry;
				carry = 0;
				if (sum > 9) {
					sum = sum % 10;
					carry++;
				}
				strAns.insert(0, String.valueOf(sum));
			}
		}
		String ans = strAns.toString();
		return ans;
	}

	public static String sumOfTwo(String str1, String str2) {
		if (str1.length() > str2.length()) {
			return returnSumOfTwo(str1, str2);
		} else
			return returnSumOfTwo(str2, str1);
	}
}
/**
 * if(str1.length() > str2.length()) { for(int i = str1.length() - 1; i >= 0;
 * i--) { int int1 = Integer.parseInt("" + str1.charAt(i)); int int2 =
 * Integer.parseInt("" + str2.charAt(i)); int sum = int1 + int2 + carry; carry =
 * 0; if(sum > 9) { sum = sum % 10; carry++; } } }
 */
