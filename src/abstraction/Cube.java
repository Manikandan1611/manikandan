package abstraction;

class Cube implements Structure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cube s = new Cube();

		s.length();

		s.circumference();
	}

	@Override
	public void length() {
		// TODO Auto-generated method stub
		int a = 5;
		System.out.println(a * a);
	}

	@Override
	public void circumference() {
		// TODO Auto-generated method stub
		int b = 8;
		System.out.println(4 * b);
	}

}
