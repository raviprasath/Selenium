package week2dailyhw;

import java.util.Scanner;

public class NumberDivideBy3And5 {

	public static void main(String[] args) {

		//Initialize the scanner class
		Scanner scan = new Scanner(System.in);

		//Getting inputs from user
		System.out.println("Enter the first input value: ");
		int number1=scan.nextInt();
		System.out.println("Enter the second input value: ");
		int number2=scan.nextInt();
		//Performing actions for those number is divisible by 3 and 5 
		System.out.println();
		System.out.print("Output:");
		for(int i = number1; i<=number2; i++)
		{
			if (i%3==0 )
				if(i%5==0)
					System.out.print(" FIZZBUZZ");
				else 
					System.out.print(" FIZZ");
			else
				if(i%5==0)
					System.out.print(" BUZZ");

				else if(i%3 !=0 && i%5 !=0)
					System.out.print(" "+i);
			//Close scanner class
			scan.close();
		}
	}
}
