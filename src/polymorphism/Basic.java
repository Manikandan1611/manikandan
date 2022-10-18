package polymorphism;

public class Basic {

	void print() { // Method Overriding
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

	void pattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println(" ");
		}

	}
}
