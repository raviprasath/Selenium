package week4homework;

import java.util.Scanner;

public class LargeNumber {

//	public static void main(String[] args) {
//		//Initialize Scanner class
//		Scanner scan = new Scanner(System.in);
//
//		//Getting number input from user
//		System.out.println("Enter the number: ");
//		int number = scan.nextInt();
//		
//		int inputNumber = number;
//		
//		//Getting digit input from user
//		System.out.println("Enter the digit: ");
//		int digit = scan.nextInt();
//
//		while (inputNumber !=0) {
//			int quotient = inputNumber/10;
//			int remainder = inputNumber%10;
//			
//			if(remainder==digit) {
//				inputNumber=number--;
//			}
//			else {
//			inputNumber=quotient;
//			}
//			
//		}
//		System.out.println("Atleast less than number:"+number);
//		
//		//closing scanner class
//		scan.close();
		
		public static void main(String[] args) {
			//get input number & digit from user
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a number: ");
			int number = scan.nextInt();
			System.out.println("Enter a digit: ");
			String digit = scan.next();	
			scan.close();

			//fetching largest number within the input number without the input digit
			//iterates (decrements) till the number contains the digit
			while(String.valueOf(number).contains(digit))
			number--;

			//print result
			System.out.println("Largest number less than given number that doesn't contain the given digit: "+number);
			}
}
