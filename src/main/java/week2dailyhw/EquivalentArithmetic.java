package week2dailyhw;

import java.util.Scanner;

public class EquivalentArithmetic {

	public static void main(String[] args) {
		//Initializing scanner class to get user inputs
		Scanner scan = new Scanner(System.in);
		
		//Getting user input as string
		System.out.println("Enter the operation name: ");
		String operation = scan.nextLine();
		
		//Getting user inputs(numbers) using Scanner class
		System.out.println("Enter the user input number1: ");
		int num1=scan.nextInt();
		System.out.println("Enter the user input number2: ");
		int num2=scan.nextInt();

		//Performing the equivalent arithmetic operation
		int multiply = num1*num2;

		//Print the output value
		System.out.println(operation + " of "+num1+" and "+num2+" is: "+multiply);
		scan.close();
	}

}
