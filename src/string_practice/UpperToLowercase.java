package string_practice;

public class UpperToLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "VIJAYAKUMAR";

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			System.out.print((char) (ch + 32));

		}


	}

}
