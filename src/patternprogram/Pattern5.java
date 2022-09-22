package patternprogram;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Square pattern
		int a=5;
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=a;j++) {
				if(i==0||i==5||j==0||j==5)
				System.out.print("* ");
				else {System.out.print("  ");}
			}System.out.println();
		}


	}

}
