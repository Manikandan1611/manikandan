package array;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {6,8,2,10,13};
		int b[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			System.out.println(b[i]);
		}

	}

}
