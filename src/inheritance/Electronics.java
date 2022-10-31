package inheritance;

//Heirarchical Inheritance

class Electronics {
	void Elec() {
		System.out.println("Base class");
	}

	public static void main(String[] args) {
		Airconditioner a = new Airconditioner();
		a.Elec();
		a.grinding();
		Refrigerator m = new Refrigerator();
		m.keepcold();
	}
}

class Airconditioner extends Electronics {
	void grinding() {
		int a=10;
		int b=3;
		int c=a+b;
		System.out.println(c);
		
		System.out.println("Defined class 1");
	}

}

class Refrigerator extends Electronics {
	void keepcold() {
		System.out.println("Defined class 2");
		
		
		
		
	}
}