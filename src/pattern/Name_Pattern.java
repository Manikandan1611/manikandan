package pattern;

public class Name_Pattern {

	void PatternM() {
		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= 10; col++) {
				if (col == 1 || col == 10 || row == col && col <= 5 || (row + col == 10 && row <= 5)) {
					System.out.print("M");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	void PatternA() {

		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= 10; col++) {
				if ((row == 1 || row == 6 || (col == 1 || col == 10))) {
					System.out.print("A");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	void PatternN() {
		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= 10; col++) {
				if ((col == 1 || col == 10) || (row == col)) {
					System.out.print("N");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	void PatternI() {

		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= 10; col++) {
				if ((row == 1 || row == 10) || (col == 6)) {
					System.out.print("I");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

	void PatternK() {

		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= 10; col++) {
				if (row >= 1 && col == 1 || row == col && col >= 10 / 2 || row + col == 10 - 1 && row < 4 * (10 / 5)) {
					System.out.print("K");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

	void PatternA1() {

		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= 10; col++) {
				if ((row == 1 || row == 6 || (col == 1 || col == 10))) {
					System.out.print("A");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	void PatternN1() {
		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= 10; col++) {
				if ((col == 1 || col == 10) || (row == col)) {
					System.out.print("N");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	void PatternD() {
		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= 10; col++) {
				if ((row == 1 || row == 10) || (col == 3 || col == 10)) {
					System.out.print("D");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	void PatternA2() {

		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= 10; col++) {
				if ((row == 1 || row == 6 || (col == 1 || col == 10))) {
					System.out.print("A");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	void PatternN2() {
		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= 10; col++) {
				if ((col == 1 || col == 10) || (row == col)) {
					System.out.print("N");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	void PatternS() {

		for (int row = 1; row <= 10; row++) {

			for (int col = 1; col <= 10; col++) {
				if ((row == 1) || (row == 5) || (row == 10) || ((col == 1) && (row < 5))
						|| ((col == 10) && (row > 4))) {
					System.out.print("S");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name_Pattern s = new Name_Pattern();
		s.PatternM();
		s.PatternA();
		s.PatternN();
		s.PatternI();
		s.PatternK();
		s.PatternA1();
		s.PatternN1();
		s.PatternD();
		s.PatternA2();
		s.PatternN2();
		s.PatternS();
	}
}
