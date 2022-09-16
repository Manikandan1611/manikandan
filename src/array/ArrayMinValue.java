package array;

public class ArrayMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,2,-1,4,-2,-3,7,8};
	     int mini=a[0];
	     for(int i=0; i<a.length; i++)
	     { 
	     if(a[i]<mini)
	     {
	     mini=a[i];
	     }
	    }
	     System.out.println(mini);
	}

}
