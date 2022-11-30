package practice;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first = 0, second = 1;

		while (first <= 13) {
			System.out.println(first);
			second = first + second;

			first = second - first;

		}

	}
}
