package Day19;

public class Mobile {
	
	String Brand;
	double price;
	
	Mobile(){
		
		Brand="Redmi";
	    price=44000.0;
	}
	
	void display() {
		
		System.out.println("Mobile Brand:"+Brand);
		System.out.println("Mobile price:"+price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m=new Mobile();
		
		m.display();

	}

}
