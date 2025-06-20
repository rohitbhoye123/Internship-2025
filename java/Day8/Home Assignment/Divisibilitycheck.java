package Demo1;
import java.util.*;

public class Divisibilitycheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		int number=sc.nextInt();
		
		if(number % 5== 0 && number % 11 == 0) {
		System.out.println(number+"is divisible by both 5 and 11.");		
   }
	else {
		   System.out.println(number+"is NOT divisible by both 5 and 11.");
	     }
	}
}
