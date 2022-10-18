package abstraction;

class Person implements Family, Company {
	public void takecare() {
		System.out.println("JAVA");
	}

	public void attendfunction() {
		System.out.println("SQL");
	}

	public void attendance() {
		System.out.println("HTML");
	}

	public void dresscode() {
		System.out.println("CSS");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person z = new Person(); // Static(or)early Binding
		z.takecare();
		z.attendfunction();
		z.attendance();
		z.dresscode();

		Family y = new Person(); // Dynamic Binding
		y.takecare();
		y.attendfunction();

		Company x = new Person();
		x.attendance();
		x.dresscode();

	}

}
