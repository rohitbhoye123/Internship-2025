package Demo1;

public class Employeee {
	
	String name;
	int id;
	
	Employeee(String name, int id){
		
		this.name=name;
		this.id=id;
	}
	
	void displayInfo() {
		
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Id:"+id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employeee e=new Employeee("Rohit Bhoye",1);
		e.displayInfo();
	}

}
