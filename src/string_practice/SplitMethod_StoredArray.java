package string_practice;

public class SplitMethod_StoredArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "mani siva deva john arun jega";
		int count = 1;
		String key = " ";

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == key.charAt(0)) {
				count++;
			}

		}
		System.out.println("count of words " + count);

		String b[] = new String[count];
		String temp = "";
		int j = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == key.charAt(0)) {
				b[j] = temp;
				j++;
				temp = "";
				continue;
			}
			temp = temp + a.charAt(i);

		}
		b[j] = temp;
		for (String k : b) {
			System.out.println(k);
		}

	}
}
