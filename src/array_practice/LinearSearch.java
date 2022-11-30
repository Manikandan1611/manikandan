package array_practice;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 100, 20, 30, 80, 50, 60 };

		int num = 80;
		int m = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == num)
				m = a[i];
		}

		if (num == m) {
			System.out.println("The given element is present ");
		} else {
			System.out.println("The given element is not present");

		}
	}
}
