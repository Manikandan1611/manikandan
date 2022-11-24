package array_practice;

public class MovingAllElements_TowardsLeftTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 5, 10, 15, 20, 25, 30, 35, 40 };
		int b = a[0];
		int c = a[1];
		for (int i = 0; i < a.length - 2; i++) {
			a[i] = a[i + 2];
		}
		a[a.length - 1] = b;
		a[a.length - 2] = c;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");

		}

	}
}
