package assignment;

public class PrimeInFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int f=0;
		int s=1;
		int n=0;

		for(int i=0;i<20;i++) {

			f=s;
			s=n;
			n=f+s;
			boolean k=true;
			for(int j=2;j<n;j++) {

				if(n%j==0) {
				k=false;

				}}

				if(k) {
					System.out.println(n);
					System.out.println();
				}
		}

	}

}
