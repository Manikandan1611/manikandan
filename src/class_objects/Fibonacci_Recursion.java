package class_objects;

public class Fibonacci_Recursion {

	int f = 1;
	int n = 0;

	void m() {
		System.out.println(n);
		f = f + n;
		n = f - n;
		if (n <= 10) {
			m();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fibonacci_Recursion s = new Fibonacci_Recursion();
		s.m();

	}

}
