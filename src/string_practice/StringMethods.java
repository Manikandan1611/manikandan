package string_practice;

public class StringMethods {

	void compareTo() {
		String name1 = "mani";
		String name2 = "deva";
		int i = name1.compareTo(name2);
		System.out.println(i);
	}

	void compareToIgnoreCase() {
		String name1 = "ABCD";
		String name2 = "abcd";
		int i = name1.compareToIgnoreCase(name2);
		System.out.println(i);
	}

	void contains() {
		String name1 = "manikandan";
		String name2 = "mani";
		boolean i = name1.contains(name2);
		System.out.println(i);
	}

	void concat() {
		String name1 = "mani";
		String name2 = "kandan";
		String i = name1.concat(name2);
		System.out.println(i);
	}

	void equals() {
		String name1 = "manikandan";
		String name2 = "";
		boolean i = name1.equals(name2);
		System.out.println(i);
	}

	void substring() {
		String name1 = "manikandan";
		// String name2="mani";
		String i = name1.substring(0, 4);
		System.out.println(i);
	}

	void split() {
		String name1 = "mani kandan";
		// String name2="mani";
		String[] i = name1.split(" ");
		for (String a : i)
			System.out.println(a);
	}

	void StartsWith() {
		String name1 = "manikandan";
		String name2 = "mani";
		boolean i = name1.startsWith(name2);
		System.out.println(i);
	}

	void EndsWith() {
		String name1 = "mani kandan";
		String name2 = "kandan";
		boolean i = name1.endsWith(name2);
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringMethods m = new StringMethods();
		// m.compareTo();
		// m.compareToIgnoreCase();
		// m.contains();
		// m.concat();
		// m.equals();
		// m.substring();
		// m.split();
		// m.StartsWith();
		m.EndsWith();
	}

}
