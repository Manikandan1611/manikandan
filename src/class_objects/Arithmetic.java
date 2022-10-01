package class_objects;

public class Arithmetic {
	void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	void sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arithmetic v = new Arithmetic();
		v.add(5,0);
		v.add(6,2);
		v.sub(5,3);
		v.sub(6,3);

	}

}
