package week1day2homework;

import java.util.Scanner;

public class ScannerClassExplore {

	public static void main(String[] args) {

		Scanner scanObj = new Scanner(System.in); //Initiating scanner class

		System.out.println("Enter the input for float value is: ");//Getting float value from user
		float user1 = scanObj.nextFloat();
		System.out.println("User Height is: "+user1+"CM");
		System.out.println(); 
		System.out.println("Enter the input for double value is: ");//Getting double value from user
		double user2 =scanObj.nextDouble();
		System.out.println("User weight is: "+user2+"KG");
		System.out.println();
		System.out.println("Enter the input for char value is: ");//Getting char value from user
		String user3 = scanObj.next();
		System.out.println("User Marital status is: "+user3);

		scanObj.close(); // Closing scanner class

	}

}
