package encapsulation;

public class Employee {
	int empid = 100;
	public String name = "siva";
	protected String mobile = "9750281070";
	private String password = "1234";

	public static void main(String[] args) {
		Employee s = new Employee();
		System.out.println(s.empid);
		System.out.println(s.name);
		System.out.println(s.mobile);
		System.out.println(s.password);
	}

}
