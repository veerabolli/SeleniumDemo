package javaBasics;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "madam";
		String t="";
		// Printing the string in reverse
	for (int i=s.length()-1;i>=0;i--)
	{
		// System.out.println(s.charAt(i));
		t= t + s.charAt(i);
		
		
	}
	
	System.out.println(t);
	
		if (t==s)
		{
			System.out.println("the string is  palindrome");
		}
		else
			System.out.println("the string is not palindrome");

	}

}
