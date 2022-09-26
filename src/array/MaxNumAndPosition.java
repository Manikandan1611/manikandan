package array;

public class MaxNumAndPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {6,8,2,10,12};
		int max=a[0];
		int pos=0;
		
				for(int i=0;i<a.length;i++)
				{
					if(a[i]>max)
{
						max=a[i];
						pos=i;}
				}
					System.out.println(max);
					System.out.println(pos);
	             }
     	}

		

	


