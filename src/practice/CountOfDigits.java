package practice;

public class CountOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cake = 12345;
		int count = 0;
		while (cake > 0) {
			// System.out.println(cake%10);
			cake = cake / 10;
			count = count + 1;
		}
		System.out.println(count);
	}

}
