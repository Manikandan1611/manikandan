package assignment;

public class ReverseFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=5;i>=1;i--) {
			int a=1;
			for(int k=1;k<=i;k++) {
				a=a*k;
			}System.out.println(a);
		}

	}

}
