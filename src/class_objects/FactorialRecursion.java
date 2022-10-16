package class_objects;

public class FactorialRecursion {
	int n = 1, b = 1;

	void m1() {

		b = b * n;
		System.out.println(b);
		n++;
		if (n <= 5) {

			m1();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactorialRecursion a = new FactorialRecursion();
		a.m1();

	}

}
