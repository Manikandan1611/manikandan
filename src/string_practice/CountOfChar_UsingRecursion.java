package string_practice;

public class CountOfChar_UsingRecursion {
	int i = 0, k = 0, d = 0;

	int countofchar(char c, int count, String name) {
		if (name.charAt(i) == c) {
			count++;
		}
		i++;
		if (i < name.length()) {
			countofchar(c, count, name);

		} else {
			d = count;
		}
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfChar_UsingRecursion sc = new CountOfChar_UsingRecursion();
		String name = "Praveen";
		char c = 'e';

		System.out.println(sc.countofchar(c, 0, name));

	}

}
