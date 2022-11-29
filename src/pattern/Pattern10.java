package pattern;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int row = 5; row >= 1; row--) {
			for (int col = 5; col >= row; col--) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
	}
}
