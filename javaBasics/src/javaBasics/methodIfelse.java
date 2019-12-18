package javaBasics;

public class methodIfelse {

	// create a method AgeValidation()
	
	static void AgeValidation(int age)
	{
		if (age>=18)
		{
			System.out.println("You are allowed to play gambling");
		}
		else {
			System.out.println("You are not allowed to play gambling");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgeValidation(14);
		
		
	}

}
