package string_practice;

public class Print_OnlyAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "manikandan51362@gmail.com";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				count++;
				System.out.print(ch + " ");
			}

		}
		System.out.println();
		System.out.println("count of numbers= " + count);

	}
}