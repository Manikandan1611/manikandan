package interview_Questions;

public class Dynamic_SpiralPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int in = 5;
		int n = in % 2 == 1 ? in : in + 1;
		int y = 0;
		for (int i = 0; i < n; i++) {
			int l = n - (i * 2);
			y = l * l;
			int r = y + i;
			int h = r - (n - i - 1);
			for (int j = 0; j < n; j++) {
				int q = (n - ((j + 1) * 2));
				int b = q * q;
				int f = (b - n - i + 1) + ((n - 1 - j) * 3);
				if (i < n / 2) {

					if (i <= j && i + j <= n - 1) {
						if (y <= 9)
							System.out.print(y + "   ");
						else if (9 < y && y <= 99)
							System.out.print(y + "  ");
						else
							System.out.print(y + " ");
						y--;
					}

				} else if (j <= i && i + j >= n - 1) {
					// fin
					if (h <= 9) {
						System.out.print(h + "   ");
					} else if (9 < h && h <= 99)
						System.out.print(h + "  ");
					else
						System.out.print(h + " ");
					h++;
				}

				if (j < n / 2) {
					if (j < i && i + j < n - 1) {
						if (b <= 9) {

							System.out.print(b + i - j + "  ");
						}

						else if (9 < b && b <= 99)
							System.out.print(b + i - j + "  ");
						else
							System.out.print(b + i - j + " ");

						if (i == n / 2 && j == n / 2 - 1) {
							System.out.print(" ");
						}

					}

				} else if (i < j && i + j > n - 1) {
					if (f <= 9) {
						System.out.print(f + "   ");
					} else if (9 < f && f <= 99)
						System.out.print(f + "  ");
					else
						System.out.print(f + " ");
				}

			}
			System.out.println();
			System.out.println();
		}

	}

}
