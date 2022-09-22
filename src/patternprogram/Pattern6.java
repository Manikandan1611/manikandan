package patternprogram;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=a;j++) {
				if(i+j==5) {
				System.out.print("* ");}
				else {
					System.out.print("  ");
					
				}
			}System.out.println();
			
		}

	}

}
