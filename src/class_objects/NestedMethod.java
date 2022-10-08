package class_objects;

public class NestedMethod {
	int n = 1;

	void m1() {
		System.out.println(n);
		n++;
		m2();
	}

	void m2() {
		System.out.println(n);
		n++;
		m3();
	}

	void m3() {
		System.out.println(n);
		n++;
		m4();
	}

	void m4() {
		System.out.println(n);
		n++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NestedMethod A = new NestedMethod();
		A.m1();

	}

}
