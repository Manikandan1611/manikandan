package pattern;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int row = 1; row <= 5; row++) {

			for (int col = row; col <= 5; col++) {

				System.out.print(" ");
			}

			for (int star = 5; star >= 6 - row; star--) {
				System.out.print(star);
			}
			System.out.println();
		}

	}

}
