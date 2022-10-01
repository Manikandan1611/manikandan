package class_objects;

public class Mark {
	String name;
	int sum, m1, m2, m3, m4, m5;

	void student() {
		sum = m1 + m2 + m3 + m4 + m5;
		System.out.println(name + " " + "mark" + " " + "is" + " " + sum);
	}

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Mark a1 = new Mark();
		a1.name = "Manikandan";
		a1.m1 = 95;
		a1.m2 = 98;
		a1.m3 = 100;
		a1.m4 = 96;
		a1.m5 = 99;
		a1.student();
		Mark a2 = new Mark();
		a2.name = "Praveen";
		a2.m1 = 99;
		a2.m2 = 96;
		a2.m3 = 98;
		a2.m4 = 100;
		a2.m5 = 97;
		a2.student();

	}

}
