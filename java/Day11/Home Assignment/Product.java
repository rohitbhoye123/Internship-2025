package Demo1;

public class Product {
	
	String name;
	String category;
	double price;
	
	void displayDetails() {
		System.out.println("Product Details:");
		System.out.println("Name:"+name);
		System.out.println("Category:"+category);
		System.out.println("Price:"+price);
		System.out.println();
	}	

	public class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product1 = new Product();
		product1.name = "Laptop";
		product1.category = "Electronics";
		product1.price = 65000;
		
		Product product2 = new Product();
		product2.name = "Chair";
		product2.category = "Furniture";
		product2.price = 3000;
		
		Product product3 = new Product();
		product3.name = "Smartphone";
		product3.category = "Electronics";
		product3.price = 25000;
		
		product1.displayDetails();
		product2.displayDetails();
		product3.displayDetails();

	}
 }

}
