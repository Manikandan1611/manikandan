package patternprogram;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Left decresing traingle
		int a=5;
		for(int i=a;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("* ");
			}
			System .out.println();
		}

	}

}


/*for(int i=1;i<=4;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println(" ");
}
} */
