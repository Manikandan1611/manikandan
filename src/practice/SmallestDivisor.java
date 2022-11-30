package practice;

public class SmallestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 49;
		int div = 2;
		while (div < no) {
			if (no % div == 0) {
				System.out.println("smallest" + div);
				break;
			}
			div = div + 1;
		}
	}

}
