package array_assignment;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 8, 6, 5, 4, 3, 2, 7 };
		int m = 5;
		for (int i = 0; i < a.length; i++) {
			if (m == a[i]) {
				System.out.println("Respective element 5 is found:" + a[i]);
			}

		}

	}
}
