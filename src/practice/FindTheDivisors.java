package practice;

public class FindTheDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int no=100;
		int div=2;
		while(div<no) {
			if(no%div==0){
			System.out.println(div);
			}
			div+=1;
		}
	}

}
