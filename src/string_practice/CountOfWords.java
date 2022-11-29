package string_practice;

public class CountOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Java is a high level programming language";
		int count = 1;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == ' ') {
				count++;

			}

		}
		System.out.println("count of words= " + count);

	}

}
