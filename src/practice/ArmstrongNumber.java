package practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 153;
		int a = no;
		int armstrong = 0;
		while (no > 0) {
			int rem = no % 10;
			int power = rem * rem * rem;
			armstrong = armstrong + power;
			System.out.println(armstrong);
			no = no / 10;
		}
		if (a == armstrong) {
			System.out.println("ARMSTRONG NUMBER");
		} else {
			System.out.println("NOT ARMSTRONG NUMBER");

		}

	}

}
