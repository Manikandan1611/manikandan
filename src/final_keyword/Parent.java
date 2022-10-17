package final_keyword;

public class Parent {                         //final method
	final void data() {
		System.out.println("Data processing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child b=new Child();
		b.man();
		b.data();
	}

}

	 class Child extends Parent{
		 void man() {
			 System.out.println("Data analysis");
		 }
	 }
	