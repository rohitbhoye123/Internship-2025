package Demo.java;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Three Number:");
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		int average=(a+b+c)/3;
		System.out.println("Average Number:"+average);

	}

}
