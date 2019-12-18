package javaBasics;

public class objectsClasses {

	int x=10; // Declare a class attribute
	int y=20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // create an object of the class objectsClasses
		objectsClasses obj1= new objectsClasses();
		
		obj1.x = 25;  // Overriding the attribute value
		
		System.out.println(obj1.x); 
		System.out.println(obj1.y); 
		
		
	}

}
