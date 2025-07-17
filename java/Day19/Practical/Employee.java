package Day19;

public class Employee {
	
	String name;
	int id;
	
	Employee(String name, int id){
		
		this.name=name;
		this.id=id;
	}
	
	Employee(Employee e){
		
		this.name=name;
		this.id=id;
		
	}
	
	void display() {
		
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Id:"+id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee("Rohit Bhoye",11);
		Employee e2=new Employee("Prasad More",12);
		Employee e3=new Employee("Vikas Mali",13);
		
		e1.display();
		e2.display();
		e3.display();
				
	}

}
