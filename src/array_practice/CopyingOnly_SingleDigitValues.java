package array_practice;

public class CopyingOnly_SingleDigitValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 1, 7, 18, 20, -2, 15, 3, 9 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <=9) {
				count++;
			}
		}
		int[] b = new int[count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= 9) {
				b[j] = a[i];
				j++;
			}
		}

		for (j = 0; j < b.length; j++) {
			System.out.print(b[j] + "  ");
		}

	}

}
