package Demo1;
import java.util.Scanner;
public class SumDigitsDowhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to find sum of digits:");
		int number = s.nextInt();
		int sum=0;
		
		do {
			int digit=number % 10;
			sum +=digit;
			number/=10;
		}   while (number !=0);
		
		System.out.println("Sum of digits is:"+sum);
		s.close();
	}

}
