package Demo1;

import java.util.*;

public class Swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two number");
		int a=s.nextInt();
		int b=s.nextInt();
		
		System.out.println("Before swap");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
	}

}
