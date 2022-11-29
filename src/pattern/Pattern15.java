package pattern;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		for (int row = 5; row >= 1; row--) {
			for (int star = 1; star <= 6 - row; star++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(a);
			}
			System.out.println();
			a++;

		}

	}

}
