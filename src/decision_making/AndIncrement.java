package decision_making;

public class AndIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=3, b=5;
       if (a>2 && a++>2)
       {
    	   ++b;
       }
       else
       {
    	   a++;
       }
       System.out.println(a);
       System.out.println(b);
    }

}

