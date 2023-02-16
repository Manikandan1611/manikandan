package test_looping_programs;

public class ReversePrint_456789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 456789;
		int rev = 0;
		while (num > 0) {
			rev = num % 100;
			System.out.print(rev);
			num = num / 100;
		}

	}

}
