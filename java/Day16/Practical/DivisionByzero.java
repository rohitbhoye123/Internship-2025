package Demo1;

public class DivisionByzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=0;
		
		try {
			int result =a/b;
			System.out.println("Result:"+result);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Error:Division by zero is not.");
		}

	}

}
