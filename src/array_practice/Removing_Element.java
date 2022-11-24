package array_practice;

public class Removing_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5, 6 };
		int b = 5;
		for (int i = 0; i < a.length; i++) {
			if (b != a[i]) {
				System.out.print(a[i] + " ");
			}
		}

	}

}
