package exception_handling;

import java.util.Scanner;

public class TryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter no1");
			int no1 = sc.nextInt();
			System.out.println("Enter no2");
			int no2 = sc.nextInt();
			System.out.println(no1 / no2);
		} catch (ArithmeticException | NegativeArraySizeException nn) {
			System.out.println("Check no2");
			try {
				int no2 = sc.nextInt();
			} catch (Exception e) {
				System.out.println("please check no2");
			}
		}

	}

}
