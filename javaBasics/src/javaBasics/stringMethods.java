package javaBasics;

public class stringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="The payment amount $200 is outstanding";
		
		// calling String class default methods
		
		System.out.println (s.charAt(19));   // to fetch the character on the specified index position
		System.out.println(s.indexOf("$"));   // To fetch the index number for the specified Char with in the string.
		
		System.out.println(s.toUpperCase());  //converts string into Uppercase.
		
		System.out.println(s.substring(19));   //Return the substring of the string starting from the passed index position
		
		
		
	}

}
