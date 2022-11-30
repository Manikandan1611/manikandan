package practice;

public class PrimeNumber1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 1;

		int div = 2;
		while (no<= 100) {
			if (no % div == 0) {
                 System.out.println(no);
				//count = count + 1;
                 no=no+1;
			}
			//div = div + 1;
		}
		
		}
	}

