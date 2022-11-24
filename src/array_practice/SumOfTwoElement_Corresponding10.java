package array_practice;

public class SumOfTwoElement_Corresponding10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 3, 4, 6, 7, 3, 2, 9 };

		int i = 0;
		for (i = 0; i < a.length; i++) {
			int n = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (n + a[j] == 10)
					System.out.println(n + " " + a[j]);
			}
		}
	}

}
