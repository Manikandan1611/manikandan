package array_practice;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\

		int[] a = { 7, 9, 7, 6 };
		int[] b = { 5, 6, 9, 3 };

		int[] c = new int[a.length];
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

	}

}
