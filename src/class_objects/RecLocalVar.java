package class_objects;

public class RecLocalVar {
	void m1(int n) {
		System.out.println(n);
		n++;
		if (n <= 5) {
			m1(n);
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RecLocalVar a = new RecLocalVar();
		a.m1(1);

	}

}
