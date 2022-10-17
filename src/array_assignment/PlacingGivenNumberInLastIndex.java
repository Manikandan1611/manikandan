package array_assignment;

public class PlacingGivenNumberInLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 9 };
		int k = 8;
		int l = a.length - 1;
		a[l] = 8;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

	}

}
