package inheritance;

 class Base {
	 static int a=14;
 }
 
 class Defined extends Base {
	 int c=10;


	 	public static void main(String[] args) {
	 		// TODO Auto-generated method stub
	       
	 		Defined m=new Defined();
	 		System.out.println(m.c);
	 		System.out.println(m.a);
	 	}
	 }
