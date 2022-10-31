package string;

public class VowelsFinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="MANIKANDAN S";
		String vowels="AEIOUaeiou";
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			for(int j=0;j<vowels.length();j++) {
				char d=vowels.charAt(j);
				
				if(c==d) {
					System.out.println(c);
				}
			}
			
		}
	}

}
