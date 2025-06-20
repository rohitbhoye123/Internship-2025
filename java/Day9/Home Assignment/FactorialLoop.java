package Demo1;

public class FactorialLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int num = 1; num <= 5; num++) 
		{
			int fact = 1;
			
			for (int i=1; i<=num;i++) {
				fact*=i;
			}
		System.out.println("Factorial of"+num+"="+fact);	
		}

	}

}
