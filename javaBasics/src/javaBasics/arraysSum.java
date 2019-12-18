package javaBasics;

public class arraysSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {20,40,80,90};
		int sum=0;
		
		for (int i=0;i<a.length;i--)
		{
			sum= sum+ a[i];
			
		}
	System.out.println(sum);
	}

}
