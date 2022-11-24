package array_practice;

public class Addition_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5, 6 };

		int[] b = { 6, 5, 4, 3, 2, 1 };

		int big = a.length > b.length ? a.length : b.length;
		int small = a.length < b.length ? a.length : b.length;
		int[] c = new int[big];
		for (int i = 0; i < small; i++) {
			c[i] = a[i] + b[i];
		}

		for (int i = small; i < big; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");

		}

	}
}
