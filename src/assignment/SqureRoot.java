package assignment;

public class SqureRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 81, y = 0;
		int i = 1;
		for (i = 1; i <= n / 2; i++) {
			y = i * i;
			if (y == n) {
				System.out.println(i+  "is the square root of"  +n);
			}
		}
	}

}
