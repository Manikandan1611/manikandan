package for_loop;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         int n=1268737667;
         int t=0,b=0;
         while(n>0)
      {
	     b=n%10;
	     System.out.println(b);
	     n=n/10; 
	     t=t+b;
      }
         System.out.println(t);
	   
    }

}




