package class_objects;

public class FactorialSeries {
	int a = 5, b = 1;

	void fact() {
		for (int i = 1; i <= a; i++) {
			b = b * i;
			System.out.println(b);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialSeries m = new FactorialSeries();

		m.fact();

	}

}
