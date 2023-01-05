package lambda_expression;

@FunctionalInterface
public interface Inter {

	public abstract int display(int no1, int no2);

	public default void test2() {
		System.out.println("Default ");
	}

	public static void test3() {
		System.out.println("static ");
	}

}
