package patternprogram;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Right Incresing traingle
		int a = 5;
		for (int i = 1; i <= a; i++) {
			for (int j = a - i; j > 0; j--) {
				System.out.print("  ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
