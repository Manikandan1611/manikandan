package while_loop;

public class AddSplitDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7589;
		int sum=0;
		   while(num>0) 
		   {
		      int r = num%10;
		      sum = sum+r;
		      num = num/10;
		      System.out.println(sum);
		   }
		   System.out.println(sum);
	   }
		 
	}


