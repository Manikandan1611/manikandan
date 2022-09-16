package while_loop;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=9875,r=0,t;
       t=num;
       while(num>0)
       {
    	   t=num%10;
    	   r=r+t;
    	   System.out.println(r);
    	   num=num/10;
       }
       System.out.println(r);
       }
    	   

}
