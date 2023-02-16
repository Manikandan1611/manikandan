package interview_Questions;

public class String_CapsAndSmall_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="manikandan";
		
		int len =s.length();
		char ch[]=s.toCharArray();
		for(int i=0;i<len;i+=2) {
		if(ch[i]%2==0) {
			String se =s.toUpperCase();
				
				System.out.println(se);
			}
		}

	}}


