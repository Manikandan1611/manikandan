package class_objects;

public class Recursion {   //Method call itself and Alternative of looping Statement
	int n = 1;

	void m1() {
		System.out.println(n);
		n++;
		if (n <= 10) {
			m1();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Recursion a = new Recursion();
		a.m1();

	}

}
