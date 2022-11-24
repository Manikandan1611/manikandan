package array_practice;

public class CopyingArray_ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 10, 20, 30, 40, 50 };
		int len = a.length;
		int[] b = new int[len];
		int i = 0, j = len - 1;
		while (i < a.length) {
			b[i] = a[j];
			i++;
			j--;
		}
		for (i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
