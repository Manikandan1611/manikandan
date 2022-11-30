package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=13;
		int div=2;
		int count=0;
		while(div<no) {
			if(no%div==0) {
				System.out.println(div);
				count=count+1;
				System.out.println(count);
				
			}
			div=div+1;
		}
		if (count==0) {
			System.out.println("PRIME NUMBER");
		}
		else {
			System.out.println("NOT PRIME NUMBER");
			
			}
		}

	}


