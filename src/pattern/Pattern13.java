package pattern;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s = 'A';
		for (int row = 1; row <= 5; row++) {
			for (int star = row; star <= 5; star++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(s);
				s++;
			}
			System.out.println();

		}

	}
}
