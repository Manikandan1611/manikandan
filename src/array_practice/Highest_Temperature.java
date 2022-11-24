package array_practice;

public class Highest_Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] temp = { -7, -6, -5, -10, -8 };
		int highest = temp[0];

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] > highest)
				highest = temp[i];
		}
		System.out.println("The highest temperature is " + highest);

	}

}
