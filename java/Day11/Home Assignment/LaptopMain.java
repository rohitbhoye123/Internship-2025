package Demo1;

class Laptop {
	
	String brand;
	String processor;
	int ram;
	int storage;
	
	void displayDetails() {
		
		System.out.println("Laptop Details:");
		System.out.println("Brand:"+brand);
		System.out.println("Processor:"+processor);
		System.out.println("RAM:"+ram+"GB");
		System.out.println("Storage: "+storage + "GB");
	}
	 
    public class Laptopmain{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop myLaptop = new Laptop();
		
		myLaptop.brand = "ASUS";
		myLaptop.processor = "Ryzen 7 7735HS";
		myLaptop.ram = 16;
		myLaptop.storage = 512;
		
		myLaptop.displayDetails();

	}

   }
}
