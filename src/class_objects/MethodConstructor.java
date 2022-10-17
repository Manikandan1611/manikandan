package class_objects;

public class MethodConstructor {
	int rollNo;
	String name;
	

	MethodConstructor(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
		display();
	}

	void display() {
		System.out.println(rollNo);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodConstructor s = new MethodConstructor(1, "mani");

		s.rollNo = 3;
		s.name = "Selva";
		s.display();

	}

}
