package javaBasics;

public class staticvsPublic {

	// create a static method
	static void staticMethod(int sum)
	{
		System.out.println("The Static Method result - sum is : " +sum);
	}
	
	// create a public method
	public void publicMethod(int x)
	{
		System.out.println("the value of x is: " +x);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling the static method with out object creation
		staticMethod(487);
		
		// calling a public method by creating an object of that class
		staticvsPublic p = new staticvsPublic();
		p.publicMethod(47);
		
		
	}

}
