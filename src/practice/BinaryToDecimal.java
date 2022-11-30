package practice;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		long num = 1011;
		int decimalNumber = 0, i = 0;
		long remainder;

		while (num != 0) {
			remainder = num % 10;
			num /= 10;
			decimalNumber += remainder * Math.pow(2, i);
			i += 1;

		}
		System.out.println("Binary to Decimal");
		System.out.println(decimalNumber);
	}
}