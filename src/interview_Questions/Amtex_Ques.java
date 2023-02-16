package interview_Questions;

public class Amtex_Ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "manikandan";
		char ch[]=s.toCharArray();
		 
		for (int i = 0; i < s.length(); i++) {
			//char ch[]=s.toCharArray();
			ch[i]=s.charAt(i);
			if (ch[i] % 2 != 0) {
			//String m=toUpperCase();
			//	System.out.println(toUpperCase());
			}
			else {
				String n=s.toLowerCase();
				System.out.println(n);

			}

		
		}

	}
}
