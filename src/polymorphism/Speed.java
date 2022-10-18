package polymorphism;

public class Speed extends Basic {
	int n = 1;

	void print() { // Recursion
		System.out.println(n);
		n++;
		if (n <= 10) {
			print();
		}
	}

	public static void main(String[] args) {
		Speed s = new Speed();
		Basic g = new Basic();
		g.print();
		s.pattern();
		s.print();
	}
}