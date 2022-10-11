package for_loop;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7, c = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0)
				c++;
		}
		if (c > 0) {
			System.out.println("NOT PRIME");
		} else {
			System.out.println("PRIME");

		}
	}

}
