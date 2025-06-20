package Demo1;

class Device{
	
	void powerOn() {
		System.out.println("Device is powering on...");
	}
}

class Smartphone extends Device{
	
	void powerOn() {
		System.out.println("smartphone is starting up...");
	}
}

class Tablet extends Devicemain{
	
	void powerOn() {
		System.out.println("Tablet is booting...");
	}
	
}

public class Devicemain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Smartphone phone=new Smartphone();
		Tablet tab=new Tablet();
		
		phone.powerOn();
		tab.powerOn();

	}

}
