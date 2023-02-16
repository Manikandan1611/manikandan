package interview_Questions;

public class Dheeran_tech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 511, 672, 733, 894, 955 };
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				int k = ((a[j - 1] % 100) / 10) * 10;
				int y = ((a[j] % 100) / 10) * 10;
				if (k < y) {
					int x = a[j - 1] % 10;
					int z = a[j] % 10;
					a[j - 1] = ((a[j - 1] / 100) * 100) + y + x;
					a[j] = ((a[j] / 100) * 100) + k + z;
				}
			}
		}
		for (int y : a) {
			System.out.println(y);
		}

	}

}
