package string_practice;

public class Only_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "education";

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':

				System.out.println(ch);

			}

		}
	}
}
