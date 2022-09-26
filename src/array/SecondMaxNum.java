package array;

public class SecondMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {6,8,2,10,12};
		int max=a[0];
		int max2=a[0];
		int b=-1;
		int c=-1;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max) {
				max=a[i];
				b=i;
			}
			
		}
		System.out.println("max value ;"+max);
		System.out.println("max position ;"+b);
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max2&&a[i]!=max) {
				max2=a[i];
				c=i;
			}
			
			
			}
		
			System.out.println("max2 value ;"+max2);
			System.out.println("max2 position ;"+c);
	}



	}


