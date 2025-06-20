package Demo1;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		
		int a=s.nextInt();
		int b=s.nextInt();
		
		if(a<b)
		{
			System.out.println(a+"Smaller than"+b);
		}
		else if(a>b)
		{
			System.out.println(a+"Greater than"+b);
		}
	   else {
		    System.out.println(a+"Equal to"+b);
	   }
	}
}
