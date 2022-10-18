package polymorphism;

public class Maths { // Method Overloading
	void Max(int a, int b) {
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

	}

	void Max(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maths m = new Maths();
		m.Max(1, 2);
		m.Max(1, 2, 3);
	}

}
