package practice;

public class CountOfDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int no=100;
	    int div=2;
	    int count=0;
	    while(div<no) {
	    	if(no%div==0) {
	    		count=count+1;
	    	}
	    	div=div+1;
	    }
	    System.out.println(count);
	}

}
