package array_practice;

public class Highest_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 181, 147, 114, 130, 126, 118 };
		int highest = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > highest) {
				highest = num[i];
			}

		}
		System.out.println("The highest value in given array is " + highest);

	}

}
