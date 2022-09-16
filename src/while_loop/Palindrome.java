package while_loop;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=757;
        int h=num;
        int reverse=0;
        while (num>0)
        {
        	int remainder= num%10;
        	num=num/10;
        	reverse= reverse*10+remainder;
        }
        System.out.println(reverse);
        if(h==reverse)
        {
        	System.out.println("Given number is palindrome");
        }
        else
        {
        	System.out.println("Not a palindrome number");
        	
	  	
        }
        	
	}

}
