package array;

public class FoundOrNotfound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int a[]= {5,3,2,7,6,2};
        int m=0;
        
        for(int i=0; i<=a.length-1; i++) 
        {
        if(a[i]==3)
        {
        	m++;
        }
      
     
        }  
        if(m==1) 
        {
        	System.out.println("found");
        	
        }
        else
        {
        	System.out.println("not found");
        }
       
	}
	
}


