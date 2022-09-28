package class_objects;

public class Square {
	int a;
	int b;

	void area() {
		System.out.println(a * b);
	}
	void add() {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Square s1 = new Square();
		Square s2 = new Square();
		s1.a = 5;
		s2.a = 10;
		s2.b=5;
		s1.b = 10;
		s1.area();
		s2.area();
		s1.add();
		s2.add();

	}

}
