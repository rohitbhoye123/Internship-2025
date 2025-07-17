package Day19;

public class Student {
	
	String name;
	int id;
	int marks;
	
	Student(String name, int id, int marks){
		
		this.name=name;
		this.id=id;
		this.marks=marks;
	}

	void display() {
		
		System.out.println("Student Name:"+name);
		System.out.println("Student id:"+id);
		System.out.println("Student marks:"+marks);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student("Rohit Bhoye",1,78);
		s.display();
	}

}
