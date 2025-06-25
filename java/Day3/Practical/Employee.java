package Demo1;

public class Employee {

		 String name;
		 int id;
		  
		 static int employeeCount=0;
		 
		 Employee(String name, int id)
		 {
			 this.name=name;
			 this.id=id;
			 employeeCount++;
			 
		}
		 
		 void display()
		 {
			 System.out.println("Employee ID:"+id);
			 System.out.println("Employee Name:"+name);
			 
		 }
		 
		 static void displayEmployeeCount()
		 {
			 System.out.println("Total Employees:"+employeeCount);
			 
		 }
		 public static void main(String[] args) {
				// TODO Auto-generated method stub
			  
			 Employee e1=new Employee("Rohit",101);
			 Employee e2=new Employee("vikas",102);
			 Employee e3=new Employee("prasad",103);
			 
			 Employee.displayEmployeeCount();
		 }
		
   }	 


