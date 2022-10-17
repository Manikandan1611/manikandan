package array_assignment;

public class FindIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,1,8,5,3,9,7};
		int m=7;
		for(int i=0; i<a.length;i++) {
			if(m==a[i])
			{
				System.out.println("The element position of the index is:" +i);
			}
		}

	}

}
