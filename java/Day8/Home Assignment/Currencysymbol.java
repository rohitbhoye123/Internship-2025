package Demo1;
import java.util.Scanner;

public class Currencysymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter currency code(INR,USD,EUR,GBP):");
			String currency=sc.next().toUpperCase();
			
			switch (currency) {
			case "INR":
				System.out.println("Currency Symbol:₹");
				break;
			case "EUR":
				System.out.println("Currency Symbol:€");
			    break;
			case "USD":
				System.out.println("Currency Symbol:$");
				break;
				default:
			case "GBD":
			    System.out.println("Currency Symbol:£");
			    break;
			}
		}
	}

}
