package string_practice;

public class Contains_method {
	private void check_contains() {
		// TODO Auto-generated method stub
		String s1 = "this was a temple";
		String s2 = "is";
		int j = 0;
		boolean present = false;
		for (int i = 0; i < s1.length(); i++) {
			if (i != 0) {
				if ((j == 0 && s1.charAt(i - 1) == ' ') || (j == s2.length() - 1 && s1.charAt(i + 1) == ' ')) {
					present = true;
				}
			}
			if (s2.charAt(j) == s1.charAt(i)) {
				// present = true;

				j++;
				if (s2.length() == j)
					break;
			}
		}

		if (j == s2.length() && present == true) {
			System.out.println("Yes present");
		} else {
			System.out.println("Not Present");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contains_method c = new Contains_method();
		c.check_contains();

	}

}
