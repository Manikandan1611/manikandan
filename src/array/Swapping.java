package array;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,7,6};
		for(int i=0;i<3;i++) {
		int b=a[a.length-1];
		for(int j=a.length-1;j<0;j--)
		{
			a[j]=a[j-1];
		}
		a[0]=b;
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
}
