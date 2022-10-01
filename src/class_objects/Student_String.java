package class_objects;

public class Student_String {

	int rollNo;
	String name;
	int mark;

	void display() {
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(mark);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_String s1 = new Student_String();
		s1.rollNo = 101;
		s1.name = "Mani";
		s1.mark = 90;
		Student_String s2 = new Student_String();
		s2.rollNo = 102;
		s2.name = "sp";
		s2.mark = 80;
		s1.display();
		s2.display();

	}

}
