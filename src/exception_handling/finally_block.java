package exception_handling;

public class finally_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 100;
		int num2 = 0;
		try {
			System.out.println(num1 / num2);
			System.out.println("try block");
		} catch (Exception e) {
			System.out.println("catch block");
		} finally {
			System.out.println("finally block");
		}
	}

}
