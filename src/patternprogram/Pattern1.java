package patternprogram;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// left Incresing traingle
		int a = 5;
		for (int i = 1; i <= a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
