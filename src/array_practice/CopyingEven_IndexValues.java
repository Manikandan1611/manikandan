package array_practice;

public class CopyingEven_IndexValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = { 10, 20, 30, 40, 50, 60, 70, 80 };

		int len = ar.length / 2;
		int[] br = new int[len];
		int j = 0;
		for (int i = 0; i < ar.length; i += 2) {
			br[j] = ar[i];
			j++;
		}

		for (j = 0; j < br.length; j++) {
			System.out.print(br[j] + " ");
		}

	}

}
