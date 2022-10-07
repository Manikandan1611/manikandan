package array;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 3, 4, 5, 2, 2, 3, 3 };
		int b[] = new int[a.length];
		int t = 1;
		for (int i = 0; i <= a.length - 1; i++) {
			t = 1;
			// b[i]=t;
			// int no=a[i];
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] == a[j]) {
					t++;
					b[j] = -1;

				}

			}
			if (b[i] != -1) {
				b[i] = t;
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(b[i]);
		}
	}
}
