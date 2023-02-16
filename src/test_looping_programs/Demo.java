package test_looping_programs;

public class Demo {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1234;
		int count = 0;
		int c = a % 10;
		a = a / 10;

		while (a > 0) {
			int b = a % 10;
			a = a / 10;

			if (c < b) {
				count = 1;
			}
			c = b;
		}
		if (count == 1) {
			System.out.println("NO");
		} else {
			System.out.println("SUCCESS");
		}

	}
}
