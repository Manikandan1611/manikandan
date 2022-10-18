package polymorphism;

public class ICICI extends RBI {
	int interestRate() {
		return 5;
	}

	public static void main(String[] args) {
		ICICI m = new ICICI();
		int s = m.interestRate();
		System.out.println(s);
		m.account();
		SBI d = new SBI();
		d.reward();

	}

}