package Demo1;

import java.util.Scanner;

public class Typecastingdoubletoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the double value:");
		double d=s.nextDouble();
		
		int i=(int) d;
        
		System.out.println("Double to int:"+i);
	}

}
