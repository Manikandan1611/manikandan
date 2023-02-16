package test_looping_programs;

public class ReversePrinting_456789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 456789;
		int rev = 0;
		while (num > 0) {
			rev = num % 10;
			System.out.print(rev);
			num = num / 10;

		}

	}

}
