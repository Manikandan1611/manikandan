package array_practice;

public class CopyingOnly_OddValues_AnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = { 10, 12, 15, 17, 19, 20, 21, 23 };

		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 1) {
				count++;
			}
		}
		int[] b = new int[count];
		int j = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 1) {
				b[j] = ar[i];
				j++;
			}
		}

		for (j = 0; j < b.length; j++) {
			System.out.print(b[j] + " ");
		}

	}

}
