package array_practice;

public class Total_percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] marks = { 95, 66, 88, 93, 98 };
		int total = 0;
		for (int i = 0; i < marks.length; i++) {
			total = total + marks[i];
		}
		System.out.println("The total mark is " + total);
		int percentage = total / marks.length;
		System.out.println("The percentage is " + percentage);

	}

}
