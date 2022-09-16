package for_loop;

public class SumOfFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n1=-1;
        int n2=1;
        int n3,e=0;
        for (int i=0;i<=9; i++)
        {
        	n3=(n1+n2);
            System.out.println(""+n3);
        	n1=n2;
        	n2=n3;
        	e=e+n3;
        }
        System.out.println(e);
        	
     }
}
