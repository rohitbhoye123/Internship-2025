package Day18;

public class Person {
	
	String name;
	int age;
	String city;
	Person(String name){
		
		this.name=name;
	}
	
	Person(String name,int age){
		
		this.name=name;
		this.age=age;
	}
	
	Person(String name,int age,String city){
		
		this.name=name;
		this.age=age;
		this.city=city;
	}
	
	void display() {
		
		System.out.println("Person Name:"+name);
		System.out.println("Person age:"+age);
		System.out.println("Person city"+city);
		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person("Rohit bhoye",20,"nashik");
		Person p2=new Person("Prasad more",20,"nashik");
		Person p3=new Person("Prathamesh shejwal",19,"bhagur");
		
		p1.display();
		p2.display();
		p3.display();

	}

}
