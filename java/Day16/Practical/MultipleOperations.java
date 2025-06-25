package Demo1;
import java.util.*;
public class MultipleOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter first number: ");
			int a = sc.nextInt();
			
			System.out.println("Enter second number: ");
			int b = sc.nextInt();
			
			System.out.println("Addition: " + (a + b));
			System.out.println("subtraction: " +(a - b));
			System.out.println("Multiplication : " +(a * b));
			System.out.println("Division : " + (a / b));
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Error: " + e.getMessage());
		}catch(Exception e) {
			System.out.println("Input Error: " + e.getMessage());
			
		}finally {
			System.out.println("Program completed. Thank you");
		}

	}

}  
