package Demo1;
 class Teacher{

	
	String name;
	String subject;
	
	Teacher(String name, String subject){
		
		this.name=name;
		this.subject=subject;
	}
}

class EnglishTeacher extends Teacher{
	
	  int experienceYears;
	  
	  EnglishTeacher(String name,String subject, int experienceYears){
		  super(name,subject);
		  this.experienceYears=experienceYears;
	  }
	void display() {
		
		System.out.println("Teacher Name:"+name);
		System.out.println("Subject Subject:"+subject);
		System.out.println("Experience Years:"+experienceYears);
	}
}
	public class TeacherMain{
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  EnglishTeacher m=new EnglishTeacher("Bagul sir","JAVA",5);
	
	    m.display();
	}
}	
