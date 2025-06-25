package Demo1;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	
	}
	
	public double add(double a, double b) {
		return a + b;

    }
	
	public double add(double a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		
		System.out.println("add(int, int): " + calc.add(5, 10));
		System.out.println("add(int, int): " + calc.add(1, 2, 3));
		System.out.println("add(double, double): " + calc.add(2.5, 3.5));
		System.out.println("add(int, double): " + calc.add(4, 2.5));		
		System.out.println("add(double, int): " + calc.add(3.5, 2));
			
	}
}