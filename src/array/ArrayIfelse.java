package array;

public class ArrayIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = new int[3];
        a[0]=5;
        a[1]=6;
        a[2]=7;
        if (a[0]>a[1] && a[0]>a[2])
        {
        	System.out.println("a[0] is bigger");
        }
        else if (a[1]>a[2])
        {
        	System.out.println("a[1] is bigger");
        }
        else
        {
        	System.out.println("a[2] is bigger");
          }
     }
	
}
    
