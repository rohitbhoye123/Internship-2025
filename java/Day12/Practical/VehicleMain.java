package Demo1;

 class Vehicle {
	
	void start() {
		System.out.println("Vehicle is starting..");
	}
}

class Bike extends Vehicle{
	
	void  kickStart() {
		System.out.println("Bike is kick-starting..");
	}
		
}

class Car extends Vehicle{
	
	void pushStart() {
		System.out.println("Car is push-starting..");
	}
}
public class VehicleMain{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b=new Bike();
		b.start();
		b.kickStart();
		
		Car c=new Car();
		c.start();
		c.pushStart();

	}

}
