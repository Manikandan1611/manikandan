package abstraction;

abstract public class Bank {
	void account() {
		System.out.println("Account created");
	}

	abstract void intrestRate(); // abstract method

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IOB m = new IOB();
		m.account();
		m.intrestRate();

	}

}

class IOB extends Bank {
	void intrestRate() {
		System.out.println("5%");
	}
}
