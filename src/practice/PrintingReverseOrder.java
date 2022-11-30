package practice;

public class PrintingReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 1234;
		int b = 0;
		while (no > 0) {
			b = no % 10;
			System.out.print(b);
			no = no / 10;

		}

	}

}
