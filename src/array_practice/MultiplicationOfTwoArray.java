package array_practice;

public class MultiplicationOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3 };
		int b[] = { 4, 5, 6 };

		int len1 = a.length;
		int len2 = b.length;

		int small = len1 < len2 ? len1 : len2;
		int big = len1 > len2 ? len1 : len2;
		int c[] = new int[big];

		for (int i = 0; i < small; i++) {
			c[i] = a[i] * b[i];
		}
		if (a.length > b.length) {
			c[c.length - 1] = a[a.length - 1];
			for (int i = small; i < c.length; i++) {
				c[i] = a[i];

			}
		} else if (b.length > a.length) {
			c[c.length - 1] = b[b.length - 1];
			for (int i = small; i < c.length; i++) {
				c[i] = b[i];

			}
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
