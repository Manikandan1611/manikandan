package string_practice;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "200";
		int a = 9;
		// Converting String into int using Integer.parseInt()
		int i = Integer.parseInt(s);  //INTEGER.valueOf | NumberCase
		// Printing value of i
		// System.out.println(i);
		i = i + a;
		System.out.println(i);
	}

}
