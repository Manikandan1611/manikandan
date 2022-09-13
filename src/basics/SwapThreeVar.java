package basics;

public class SwapThreeVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=6,c=5;
		a=a+b;
		b=a-b;
		a=a-b;
		
		b=b+c;
		c=b-c;
		b=b-c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);	
	
	}
}

