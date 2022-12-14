package collection_framework;

public class GetterSetterExample1 {

	// Main class.

	// main method
	public static void main(String argvs[]) {
		// Creating an object of the Employee class
		final Getter_Setter emp = new Getter_Setter();

		// the employee details are getting set using the setter methods.
		//emp.setEmpName(107);
		emp.setEmpName("Kathy");
		emp.setEmpDesignation("Software Tester");
		emp.setEmpCompany("XYZ Corporation");

		// Displaying the details of the employee details using the
		// 'toString()' method, which uses the getter methods
		System.out.println(emp.toString());
	}
}
