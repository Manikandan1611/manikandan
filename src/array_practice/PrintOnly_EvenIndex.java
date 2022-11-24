package array_practice;

public class PrintOnly_EvenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < num.length; i += 2) {
			System.out.print(num[i] + "  ");
		}
	}

}
