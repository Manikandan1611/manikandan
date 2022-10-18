package abstraction;

class Citizen implements India, TamilNadu {
	public void get() {
		System.out.println("18%");
	}

	public void traffic() {
		System.out.println("Obey signal");
	}

	public void sgst() {
		System.out.println("9%");
	}

	public void tnpsc() {
		System.out.println("Government exam");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Citizen s = new Citizen();
		s.get();
		s.traffic();
		s.sgst();
		s.tnpsc();
	}

}
