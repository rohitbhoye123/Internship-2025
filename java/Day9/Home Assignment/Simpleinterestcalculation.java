package Demo1;
import java.util.Scanner;

public class Simpleinterestcalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter principal (P):");
		double P=sc.nextDouble();
		
		System.out.println("Enter Rate of Interest (R):");
		double R=sc.nextDouble();
		
		System.out.println("Enter Time (T)):");
		double T=sc.nextDouble();
		double interest=(P*R*T)/100;
		
		System.out.println("Simple interest="+interest);

	}

}
