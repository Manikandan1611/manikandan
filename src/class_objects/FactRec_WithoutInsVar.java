package class_objects;

public class FactRec_WithoutInsVar {
	int fact(int n) {
		if (n > 1) {
			int f = fact(n - 1);
			return n * f;
		} else {
			return n;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactRec_WithoutInsVar m = new FactRec_WithoutInsVar();
		System.out.println(m.fact(5));
	}
}
