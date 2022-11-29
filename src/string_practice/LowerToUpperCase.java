package string_practice;

public class LowerToUpperCase {
	void mani(String s) {

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			System.out.print((char) (ch - 32));

		}
	}

	public static void main(String[] args) {

		String name = "vijay";
		LowerToUpperCase m = new LowerToUpperCase();
		m.mani(name);

	}
}
