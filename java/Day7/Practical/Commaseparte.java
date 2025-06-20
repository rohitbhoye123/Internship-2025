package Demo1;
import java.util.*;
public class Commaseparte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Student Details:");
		
		String input=s.nextLine();
		
		String[] details =input.split(",");
		
		System.out.println("Student Details");
		
		for(String Detail : details)
		{
			System.out.println(Detail);
		}
		
		
	}

}
