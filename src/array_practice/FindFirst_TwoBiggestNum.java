package array_practice;

public class FindFirst_TwoBiggestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks[] = { 55, 90, 75, 64, 95, 80 };

		int big1 = Integer.MIN_VALUE;
		int big2 = Integer.MIN_VALUE;

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] > big1) {
				big2 = big1;
				big1 = marks[i];
			} else if (marks[i] > big2) {
				big2 = marks[i];
			}
		}
		System.out.println("Biggest first two numbers " + big1 + " and " + big2);

	}

}
