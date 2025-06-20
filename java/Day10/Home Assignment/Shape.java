package Demo1;

public class Shape {
     void displayArea() {
    	 System.out.println("This is the shape class.");
	}
}
 
     class Circle extends Shape{
    	 double radius;
    	 
    	 circle(double radius){
    		 this.radius = radius;
  }
    void displayArea() {
    	double area = Math.PI*radius*radius;
    	System.out.println("Area of Circle: " + area);
   }
} 
     class Rectangle extends shape{
    	 double length, width;
    	 
    	 Rectangle(double length, double width){
    		 this.length = length;
    		 this.width = width;
   }
     
    	 void displayArea() {
    		 double area = length*width;
    	System.out.println("Area of Rectangle: "+ area);
    }	
}
     public class Main {
    	 public static void main(String[] args) {
    			// TODO Auto-generated method stub
    		 Circle circle = new Circle(5.0);
    		 Rectangle rectangle = new Rectangle(4.0, 6.0);
    		 
    		 circle.displayArea();
    		 rectangle.displayArea();
    	 }
  }