package Demo1;

import java.util.Scanner;

public class Grademessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character:");
		
		char ch=s.next().toUpperCase().charAt(0);
		
		switch(ch) {
		
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Below Average");
			break;
		case 'F':
            System.out.println("Fail");
            default:
            {
            	System.out.println("Invalid Character");
            }
            
	   }
		
	}

}
