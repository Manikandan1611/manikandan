package practice;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int decimal = 10;
		String binary = "";
		while (decimal > 0) {
			int rem = decimal % 2;
			binary = rem + binary;
			decimal = decimal / 2;
		}
		System.out.println(binary);
	}

}
