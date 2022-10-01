package class_objects;

public class ReturnType {
	void print(int k) {
		System.out.println(k);
	}

	int give() {
		int a = 6, b = 8;
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReturnType A = new ReturnType();
		A.print(3);
		int x = A.give();
		System.out.println(x);

	}

}
