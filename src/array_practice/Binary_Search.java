package array_practice;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 5, 8, 9, 12, 15 };
		int key = 12;
		int min = 0;
		int max = a.length-1;

		while (min <= max) {
			int mid = (min + max) / 2;
			if (key == a[mid]) {
				System.out.println(a[mid] + " present at " + "position " + mid);
				break;
			} else if (key < a[mid]) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
			if (min > max) {
				System.out.println("Given number is not present");
			}
		}

	}

}
