package inheritance;

public class Dog extends Animal{       //Method Overriding
    void say()
    {
	System.out.println("I am dog");
	}
    void walk() 
    {
    	System.out.println("walk in 2 legs");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Dog m=new Dog();
		m.say();
		m.run();
		m.walk();
	}

}
