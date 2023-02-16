package interview_Questions;

public class Pattern 
{
	public static void main(String[] args) 
	{
		int n = 3;
		for (int i = 3; i >= 1; i--) 
		{
			for (int j = n - 1; j >= i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) 
			{
				System.out.print(i * n+ " ");
			}
			System.out.println();
		}
		

	}
}