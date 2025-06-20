package Demo1;

import java.util.Scanner;

public class EmailSplitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email address:");
		
		String email=sc.nextLine();
		
		String[]parts=email.split("@");
		
		if(parts.length==2) {
		System.out.println("Username:"+parts[0]);
		System.out.println("Domain:"+parts[1]);
		}
	 
	   else {
		   System.out.println("Invalid email format.");
		}
		
	}

}
