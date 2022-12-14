package exception_handling;

import java.util.Scanner;

public class Demo {

	void third() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no1");
		int no1 = sc.nextInt();
		System.out.println("Enter the no2");
		int no2 = sc.nextInt();
		try {

			System.out.println(no1 / no2);
		} catch (ArithmeticException ae) {
			System.out.println("check no2 value");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.third();

	}
}
