package CrackCodeInterview;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String reverseWord(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}

		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (!arr[i].equals(" ")) {
				sb.append(arr[i]).append(" ");
			}
		}
		return sb.length() == 0 ? " " : sb.substring(0, sb.length() - 1);
	}
}
