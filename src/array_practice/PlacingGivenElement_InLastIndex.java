package array_practice;

public class PlacingGivenElement_InLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < a.length; i++) {
			a[a.length - 1] = 100;
			System.out.print(a[i]+ " ");
		}

	}

}
