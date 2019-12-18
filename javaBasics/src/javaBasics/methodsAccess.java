

//Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object

package javaBasics;

public class methodsAccess {
	
	// create a method fullThrottle()
	public void fullThrottle()
	{
		System.out.println(" The car is going as fast as it can");
		
	}
	
	// create a method speed()
	public void speed(int maxspeed)
	{
		System.out.println(" The car is going with maximum speed: " + maxspeed);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// calling method 1
		methodsAccess obj1 = new methodsAccess();
		obj1.fullThrottle();
		
		// calling method 2
		methodsAccess obj2 = new methodsAccess();
		obj2.speed(280);

	}

}
