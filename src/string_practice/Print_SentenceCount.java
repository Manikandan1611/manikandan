package string_practice;

public class Print_SentenceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Java is a programming language and a platform. Java is a high level, robust, object-oriented and secure programming language.Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995. James Gosling is known as the father of Java. Before Java, its name was Oak. Since Oak was already a registered company, so James Gosling and his team changed the name from Oak to Java.";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == '.') {
				count++;

			}

		}

		System.out.println("count of Sentences= " + count);

	}

}
