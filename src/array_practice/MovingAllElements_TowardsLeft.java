package array_practice;

public class MovingAllElements_TowardsLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 5, 10, 15, 20, 25, 30, 35, 40 };
		int b = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = b;
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i]+ " ");

		}

	}
}
