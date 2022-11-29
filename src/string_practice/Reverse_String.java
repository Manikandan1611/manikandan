package string_practice;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Manivannan";
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
			
		}System.out.println(rev);

		if (name.equals(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
}
