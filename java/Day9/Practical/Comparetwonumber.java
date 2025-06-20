package Demo1;

import java.util.Scanner;

public class Comparetwonumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=s.nextInt();
		System.out.println("Enter the second number:");
		int b=s.nextInt();
		
		System.out.println("(a>b):"+(a>b));
		System.out.println("(a<b):"+(a<b));
		System.out.println("(a==b):"+(a==b));
		System.out.println("(a!=b):"+(a!=b));
		
		
	}		

}
