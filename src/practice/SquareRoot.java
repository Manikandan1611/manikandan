package practice;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 25;
		int div = 2;
		while (div < no) {
			if (no / div == div) {
				System.out.println("Square root is" + div);
				break;
			}
			div = div + 1;

		}
	}

}
