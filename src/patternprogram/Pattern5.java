package patternprogram;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Square pattern
		int a = 4;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if (i == 1 || i == 4 || j == 1 || j == 4)
					System.out.print("* ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
