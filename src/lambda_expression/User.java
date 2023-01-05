package lambda_expression;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Inter abc = new Abc();
//		abc.test();
		Inter abc = (n1, n2) -> {
//			System.out.println(n1+n2);
			return n1 + n2;
		};
		int result = abc.display(10, 20);
		System.out.println(result);

		abc.test2();
		Inter.test3();
	}

}
