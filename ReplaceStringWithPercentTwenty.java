package CrackCodeInterview;

// Write a method to replace all spaces in a string with '%20'
public class ReplaceStringWithPercentTwenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray = { 'a', ' ', 'b', ' ', 'c' };
		char[] newChar = replaceSpace(charArray);
		System.out.println(newChar);
	}

	public static char[] replaceSpace(char[] orgStr) {
		int spaceCount = 0;
		for (int i = 0; i < orgStr.length; i++) {
			if (orgStr[i] == ' ') {
				spaceCount++;
			}
		}
		char[] newChar = new char[orgStr.length + (2 * spaceCount)];
		int newArrayIndex = 0;

		for (int i = 0; i < orgStr.length; i++) {
			if (orgStr[i] == ' ') {
				newChar[newArrayIndex] = '%';
				newChar[newArrayIndex + 1] = '2';
				newChar[newArrayIndex + 2] = '0';
				newArrayIndex += 3;
			} else {
				newChar[newArrayIndex] = orgStr[i];
				newArrayIndex++;
			}
		}
		System.out.println("Done");
		return newChar;
	}
}
