package week2dailyhw;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		//Initializing scanner class and getting an input from user
		String input, rev="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input value: ");
		input = scan.nextLine();

		//Calculating the input digits
		int length = input.length();

		//Reversing the string value and store a value in rev
		for(int i = length - 1; i >= 0; i--)
		{
			rev = rev + input.charAt(i);
		}
		
		//Checking the input and reverse number
		if(input.equals(rev))
			System.out.println("Given "+input+" text is a palindrome");
		else
			System.out.println("Given "+input+" text is not a palindrome");

		//Closing the scanner class
		scan.close();
	}

}
