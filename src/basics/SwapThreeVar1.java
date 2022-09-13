package basics;

public class SwapThreeVar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20, c=30;
	     
        // Store sum of all in a
        // (a = 60)
        a = a + b + c;
     
        // After this, b has value of a
        // (b = 60 - (20 + 30) = 10)
        b = a - (b + c);
     
        // After this, c has value of b
        // (c = 60 - (10 + 30) = 20)
        c = a - (b + c);
     
        // After this, a has value of c
        // (a = 60 - (10 + 20) = 30)
        a = a - (b + c);{
        System.out.println("After swapping a = " +
                     a + ", b = " + b +
                         ", c = " + c);
       }
	     
	}

}
