package array;

public class ArrayMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,2,-1,4,-2,-3,7,8};
	    
	    int max=0;
	    for(int i=0; i<a.length; i++)
	    { 
	    if(max<a[i])
	    {
	    max=a[i];
	    }
	   }
	    System.out.println(max);
	}

}
