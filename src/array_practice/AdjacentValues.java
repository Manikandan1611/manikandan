package array_practice;

public class AdjacentValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = { 9, 5, 13, 10 };
		int i = 0;
		for (i = 0; i < ar.length-1; i++) {
			int small = ar[i] < ar[i + 1] ? ar[i] : ar[i + 1];
			int big = ar[i] > ar[i + 1] ? ar[i] : ar[i + 1];
			for (int i1 = small; i1 <= big; ++i1) {
				System.out.print(i1+ " ");
			}

		}

	}

}
