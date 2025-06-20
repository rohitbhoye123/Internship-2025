package Demo1;

import java.util.*;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Number:");
		int num=s.nextInt();
		if(num % 2==0)
		{
			System.out.println("Number is Even");
		}
		else {
			
			System.out.println("Number is Odd");
		}
	}

}
