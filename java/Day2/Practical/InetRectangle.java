package Demo1;

import java.util.*;

public class InetRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your length:");
		int length=s.nextInt();
		System.out.println("Enter breadth:");
		int breadth=s.nextInt();
		
		int area=length*breadth;
		System.out.println("Area-"+area);

		
	}

}