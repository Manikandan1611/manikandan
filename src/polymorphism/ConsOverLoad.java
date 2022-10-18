package polymorphism;

public class ConsOverLoad { // Constructor Overloading
	int rollNo;
	String name;
	int mark;

	ConsOverLoad() {
		rollNo = 100;
		name = "mani";
		System.out.println(rollNo);
		System.out.println(name);

	}

	ConsOverLoad(int rollNo, String name, int mark) {
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(mark);

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ConsOverLoad m = new ConsOverLoad();

		ConsOverLoad m1 = new ConsOverLoad(200, "siva", 600);

	}

}
