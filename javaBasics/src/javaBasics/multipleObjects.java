package javaBasics;

public class multipleObjects {
	
	int x = 30;    // Class attribute declaration

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create two objects and change attribute value of object 1 without changing attribute value of obj2
		multipleObjects obj1 = new multipleObjects();
		multipleObjects obj2 = new multipleObjects();
		obj1.x =60;                             // Overriding the obj1 attribute value
		System.out.println(obj1.x);
		System.out.println(obj2.x);

	}

}
