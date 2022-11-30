package practice;

public class MethodCallingSumOfDigits {

	int display(int a) {
		int sum = 0;
		int b = 0;
		while (a > 0) {
			b = a % 10;
			sum = sum + b;
			a = a / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		MethodCallingSumOfDigits m = new MethodCallingSumOfDigits();
		m.display(1234);
		System.out.println(m.display(1234));

	}

}
