package Demo1;

 class MobileMain{

	String modelname;
	float price;
	
	MobileMain(String modelname, float price){
		
		this.modelname=modelname;
		this.price=price;
	}
	
	void display() {
		System.out.println("Model Name:"+modelname);
		System.out.println("Model Price:"+price);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MobileMain m1=new MobileMain("Samsung A15",45000);
		MobileMain m2=new MobileMain("Redmi 9 prime",9000);
		
		m1.display();
		m2.display();

	}

}
