package pattern;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int row = 1; row <= 5; row++) {
			for (int col = 5; col >= row; col--) {
				System.out.print(row + " ");
			}
			System.out.println();
		}

	}

}
