package javaBasics;

public class methodParameters {
	
	
	// create a method called Logout
	static void logout()
	{
		System.out.println("User Logged out successfully");
	}

	
	// create a method that returns value
	
	static int addNumbers(int x, int y)
	{
		return x+y;
	}
	
	// create a method Person
	
	
	static void Person(String fname, int age)
	{
		System.out.println(fname + " is my firstname" + " and the age is:" + age);
	}
	
	
	
	// call the logout method and Person Method in main class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calling logout method
		logout();
		
		// calling Person() method by passing arguments
		Person("VEERA", 24);
		
		// calling addNumbers() method by passing arguments
		int z= addNumbers(35,97);
		System.out.println("the sum is : " +z); 
		
		
		
	}

}
