package Demo1;
import java.util.Scanner;

public class Add extends Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Number1:");
		int a=s.nextInt();
		System.out.println("Enter your Number2:");
		int b=s.nextInt();
		int sum=a+b;
		System.out.println("Sum of integer number:"+sum);
		

	}

}
