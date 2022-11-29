package string_practice;

public class StringToInteger_exception{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="bharathi123";
		try {
		int num=Integer.parseInt(name);  
		System.out.println(num);
		}
		catch(NumberFormatException nfe) {
			System.out.println("No, not all numbers");
			
		}
				

	}

}
