package class_objects;

public class WithoutInstanceVar {
	void m(int n) {   //Call by value
		System.out.println(n);
		n++;
		if (n <= 5) {
			m(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WithoutInstanceVar A = new WithoutInstanceVar();
		A.m(1);

	}

}
