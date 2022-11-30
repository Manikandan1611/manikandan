package practice;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=2,n2=9,n3=-11;
		int largest=(n1>n2)?((n1>=n3)?n1:n3):((n2>=n3)?n2:n3);
	    System.out.println("Largest Number=" +largest);
	}
	

}
