package array_practice;

public class MovingAllElements_TowardsRightTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 5, 10, 15, 20, 25, 30, 35, 40 };
		int b = a[a.length - 1];
		int c = a[a.length - 2];
		for (int i = a.length - 3; i >= 0; i--) {
			a[i + 2] = a[i];
		}
		a[0] = b;
		a[1] = c;

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");

		}

	}
}
