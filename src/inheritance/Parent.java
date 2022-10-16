package inheritance;

public class Parent {
	
	
     Parent(int a){
    	this(3.3);
    	 System.out.println("Argument Constructor");
     }
     Parent(){
     	this(2);
    	 System.out.println("Non-Argument Constructor");
     }
     Parent(double a){
      	
    	 System.out.println("Double Constructor");
     }


}
