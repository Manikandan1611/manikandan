package for_loop;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a,b=-1, c=1;
       for ( int i=1; i<=9; i++)
       {
    	   a=b+c;
    	   System.out.println(a);
    	   b=c;
    	   c=a;
    	   
       }
	}

}
