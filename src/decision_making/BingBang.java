package decision_making;

public class BingBang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=5;
     if(n%3==0 && n%5==0)
     {
         System.out.println("BingBang");
     }
     else if (n%3==0)
     {
    	 System.out.println("Bing");
     }
     else if (n%5==0)
     {
    	 System.out.println("Bang");
     }
     else
     {
    	 System.out.println(n);
     }
      	 
   }
	
}
