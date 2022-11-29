package string_practice;

public class SrartsWith_Nonpredefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 = "Siva kesavan";
		String name2 = "Siva";

		int i = 0;
		boolean starts = true;
		for (i = 0; i < name2.length(); i++) {
			if (name1.charAt(i) == name2.charAt(i)) {
				continue;
			} else {
				starts = false;
				System.out.println("FALSE");
				break;
			}
		}
		if (starts == true) {
			System.out.println("TRUE");
		}
	}

}
