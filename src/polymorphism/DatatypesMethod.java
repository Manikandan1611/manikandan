package polymorphism;

public class DatatypesMethod {
	void mani(int a) {
		System.out.println("int=" + a);
	}

	void mani(float a) {
		System.out.println("float=" + a);
	}

	void mani(double a) {
		System.out.println("double=" + a);
	}

	void mani(byte a) {
		System.out.println("byte=" + a);
	}

	void mani(char a) {
		System.out.println("char=" + a);
	}

	void mani(boolean a) {
		System.out.println("boolean=" + a);
	}

	void mani(short a) {
		System.out.println("short=" + a);
	}

	void mani(long a) {
		System.out.println("long=" + a);
	}

	void mani(String a) {
		System.out.println("String=" + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DatatypesMethod s = new DatatypesMethod();
		s.mani(6 < 8);
		s.mani(10);
		s.mani('M');
		s.mani(2.3456);
		s.mani(4.5f);
		byte a = 1;
		s.mani(a);
		short b = 10;
		s.mani(b);
		s.mani(1611L);
		s.mani("MANIKANDAN S");

	}

}
