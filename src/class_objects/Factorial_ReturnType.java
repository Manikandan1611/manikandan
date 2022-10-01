package class_objects;

public class Factorial_ReturnType {
	int fact(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) {

			f = f * i;
		}
		return f;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial_ReturnType p = new Factorial_ReturnType();
		int a = p.fact(4);
		System.out.println(a);

	}

}
