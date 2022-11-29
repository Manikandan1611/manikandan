package string_practice;

public class LastLetter_Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Praveen";
		int len = name.length();
		char ch = name.charAt(len - 1);
		if (ch == 'n') {

			System.out.println("Last letter is Matched");
		} else {
			System.out.println("Last letter is Mis-matched");
		}
	}
}
