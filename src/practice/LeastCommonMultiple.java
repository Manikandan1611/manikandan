package practice;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no1=3,no2=9;
		int big=no1>no2?no1:no2;
		
		while(true)
		{
			if(big%no1==0 && big%no2==0)
			{
				System.out.println("LCM=" + big);
				break;
			}
			big+=1;
			}
		}
	}


