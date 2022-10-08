package class_objects;

public class PrintTheVal {
	int n = 2;

	void m1() {
		System.out.println(n);
		n++;
		if (n <= 5) {
			m1();
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintTheVal p = new PrintTheVal();
		p.m1();

	}

}
