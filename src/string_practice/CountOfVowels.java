package string_practice;

public class CountOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Selvamani";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {

				count++;

			}

		}
		System.out.println(count);

	}
}
