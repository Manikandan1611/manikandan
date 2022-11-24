package array_practice;

public class PrintingOnly_OddValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = { 10, 12, 15, 17, 19, 20, 21 };

		int total = 0;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 1) {
				System.out.println(ar[i]);
				total = total + ar[i];
				count++;
			}
		}
		System.out.println("Total of odd values is " + total);
		System.out.println("Total no. of odd values is " + count);
	}
}