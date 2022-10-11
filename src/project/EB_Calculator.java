package project;

import java.util.Scanner;

public class EB_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the unit:");
		int a = sc.nextInt();

		if (a <= 100 && a > 0) {
			System.out.println("0");
		}
		if (a > 100 && a <= 200) {
			int b = a - 100;
			double k = b * 1.5;
			System.out.println(k);
		}
		if (a > 200 && a < 500) {
			int b = (a - 200) * 3;
			int k = b + 200;
			System.out.println(k);
		}
		if (a >= 500) {
			double f = (a - 500) * 6.6;
			double k = 350 + 1380 + f;
			System.out.println(k);
		}

	}

}
