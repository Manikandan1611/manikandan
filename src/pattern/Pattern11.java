package pattern;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int row = 1; row <= 5; row++) {
			for (int star = 1; star <= 6 - row; star++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println();

		}

	}

}
