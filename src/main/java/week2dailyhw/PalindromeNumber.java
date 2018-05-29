package week2dailyhw;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the user input number: ");
		int inputNumber = scan.nextInt();
		int copyinputNumber=inputNumber;
		int reverseNumber=0;
		while (inputNumber !=0)
		{
			int Quotient = inputNumber / 10;
			int Remainder = inputNumber % 10;
			inputNumber=Quotient;
			reverseNumber=(reverseNumber*10)+Remainder;		
		}
		System.out.println("Given input number is "+copyinputNumber);
		System.out.println("Reverse number is "+reverseNumber);

		if(copyinputNumber==reverseNumber)
		{
			System.out.println("Given input number is a palindrome number");
		}
		else
		{
			System.out.println("Given input number is not a palindrome number");
		}
		scan.close();
	}
	}

