package week1dailyhomework;

import java.util.Scanner;

public class MultiplicationTableFor5 {

	public static void main(String[] args) {
		//Getting input from the user
		System.out.println("Enter the user input: "); //letting the user know to enter the input
		Scanner scanObj = new Scanner(System.in);
		int input = scanObj.nextInt();

		// User letting know the which table it is
		System.out.println("Multiplication table of "+input+" is: ");

		//Performing the multiplication operation
		int uplimit=10;
		for (int i=1;i<=uplimit;i++)
		{
			System.out.println(i+ " * "+input+ " = "+(i*input));
			scanObj.close();  //Closing the scanner method

		}
	}
}