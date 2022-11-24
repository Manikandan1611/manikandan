package array_practice;

public class Both_HighestAndLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 4, 6, 8, 10, 12, 14 };
		int lowest = a[0];
		int highest = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < lowest) {
				lowest = a[i];
			}
			if (highest < a[i]) {
				highest = a[i];
			}

		}
		System.out.println("Lowest value="  +lowest);
		System.out.println("Highest value=" +highest);

	}

}
