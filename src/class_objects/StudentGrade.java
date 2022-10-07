package class_objects;

public class StudentGrade {

	int rollNo;
	String name;
	int mark;
	char grade;

	void setGrade() {
		if (mark >= 91 && mark <= 100) {
			grade = 'A';
		}
		if (mark >= 81 && mark <= 90) {
			grade = 'B';
		}
		if (mark >= 71 && mark <= 80) {
			grade = 'C';
		}
		if (mark >= 61 && mark <= 70) {
			grade = 'D';
		}
		if (mark >= 51 && mark <= 60) {
			grade = 'E';
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentGrade s1 = new StudentGrade();
		s1.rollNo = 100;
		s1.name = "Raja";
		s1.mark = 55;
		s1.setGrade();
		System.out.println(s1.grade);

		StudentGrade s2 = new StudentGrade();
		s2.rollNo = 101;
		s2.name = "Deva";
		s2.mark = 71;
		s2.setGrade();
		System.out.println(s2.grade);
	}
}
