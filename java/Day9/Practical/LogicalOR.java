package Demo1;

import java.util.Scanner;

public class LogicalOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a age:");

        int age=s.nextInt();
        
        if(age >= 75 || age <= 18) {
        System.out.println("Person is either a senior citizen or child");
        }
        else {
        System.out.println("Person is an adult");	
        }
      	
	}

}
