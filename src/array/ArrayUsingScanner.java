package array;
import java.util.Scanner;

public class ArrayUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int [5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		   for(int i=0;i<a.length;i++)
		   {
			  a[i]=s.nextInt();		      
			
		       
		    	   int c=a[i]+5;
		    	   System.out.println("after 5 years"+c);
		    	   
		   }

	}

}
