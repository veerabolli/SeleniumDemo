
/*This class is for Overriding demonstration*/

package javaBasics;

public class overloading {
	public int sumcalculation(int x, int y)
	{
		return x + y;
		
	}
public double sumcalculation (double x, double y)
	{
		return x + y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overloading obj1 = new overloading();
		
		/*
		 * System.out.println(obj1.sumcalculation(102, 203));
		 * System.out.println(obj1.sumcalculation(104.23, 305.34));
		 */
		int sum1 = obj1.sumcalculation(102, 203);
		System.out.println("The sum of integer numbers is :" + sum1);
		
		double sum2 = obj1.sumcalculation(104.23, 305.34);
		System.out.println("The sum of double numbers is :" + sum2);

	}

}
