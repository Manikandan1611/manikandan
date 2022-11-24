package array_practice;

public class SmallestTwoValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks[] = {  55, 90, 75, 64, 95, 80 };
		int small1 = Integer.MAX_VALUE;
		int small2 = Integer.MAX_VALUE;

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < small1) {
				small2 = small1;
				small1 = marks[i];
			} else if (marks[i] < small2) {
				small2 = marks[i];
			}

		}
		System.out.println("Smallest  two values are  " + small1 + " and " + small2);
	}

}
