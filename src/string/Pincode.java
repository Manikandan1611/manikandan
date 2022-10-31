package string;

public class Pincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pincode="Chennai600028";
		boolean flag=false;
	
	    
		for(int i=0;i<pincode.length();i++) {
			char c=pincode.charAt(i);
		
			if(c>=48&&c<=57) {
				System.out.println(c);
				}
				
				if(c>=48&&c<=57) 
				{
				flag=true;
				System.out.println("String have an Integer");
			}
			else
			{
				System.out.println("String Doesn't have an Integer");
			}
		}
		
	}
	
}




