package array_practice;

public class Lowest_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] value = { 181, 147, 114, 130, 126, 118 };
		int smallest = value[0];
		for (int i = 0; i < value.length; i++) {
			if (value[i] < smallest) {
				smallest = value[i];
			}
		}
		System.out.println("The smallest value in given array is " + smallest);
	}

}
