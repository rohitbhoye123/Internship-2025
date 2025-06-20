package Demo1;

import java.util.Scanner;

public class Zeroevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int number=s.nextInt();
		
		if(number == 0)
		{
			System.out.println("Zero");		
		}
		else if(number==2)
    	{
		     System.out.println("Even");
	    }
		else
    	{
		    System.out.println("Odd");
	    }
    }
}
