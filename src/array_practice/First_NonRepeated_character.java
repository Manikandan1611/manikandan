package array_practice;

public class First_NonRepeated_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char name[] = { 'M', 'A', 'N', 'I' };

		for (int i = 0; i < name.length; i++) {
			char ch = name[i];

			int count = 0;
			for (int j = 0; j < name.length; j++) {
				if (name[j] == ch) {
					count++;
				}
			}
			if (count == 1) { // count==2 (repeated)
				System.out.println("first  non-repeated char " + "= " + ch);
				break;
			}
		}

	}

}
