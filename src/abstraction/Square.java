package abstraction;

public class Square extends Shape {
	int a; // Set of rules

	void area() {
		System.out.println(a * a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square m = new Square();
		m.a = 5;
		m.area();

	}

}
