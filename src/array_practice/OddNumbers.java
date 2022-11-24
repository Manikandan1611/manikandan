package array_practice;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				System.out.println(a[i] + " ");
			}
		}

	}
}
