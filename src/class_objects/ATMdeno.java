package class_objects;

import java.util.Scanner;

public class ATMdeno {
	int a;
	void atm() {
		int b=a/500;
		System.out.println("500 * "+b);
		int u=b*500;
		int c=a-u;
		int k=c/200;
		System.out.println("200 * "+k);
		int y=k*200;
		int h=y+u;
		int j=a-h;
		int g=j/100;
		System.out.println("100 * "+g);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMdeno m=new ATMdeno();
		Scanner sc=new Scanner (System.in);
		System.out.print("Emter the Money:");
		
		m.a=sc.nextInt();
		if(m.a%100==0) {
			m.atm();
		}else {
			System.out.println("Invalid");
		}
	}

}
