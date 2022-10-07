package class_objects;

public class Return_MaxValue {
	int max(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Return_MaxValue j = new Return_MaxValue();
		System.out.println(j.max(10, 20, 30));

	}

}
