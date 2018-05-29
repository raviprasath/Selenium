package week3homework;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		//Implementing the scanner class to get an input from user
		Scanner scan = new Scanner(System.in);

		//Intimate user to enter the input
		System.out.println("Enter the year and see the entered year is leap year or not: ");
		int year = scan.nextInt();
		
		boolean flag = false;

		//Performing the operation to find given number is leap year or not
		if	(year % 400 == 0)
			flag=true;

		else if(year%100 == 0)
			flag=false;

		else if(year%4 == 0)
			flag=true;

		else
			flag=false;

		if(flag)
			System.out.println("The given "+year+" is a leep year");
		else
			System.out.println("The given "+year+" is not a leep year");

		/*
		 if(((n%4==0)&&(n%100!=0)) || n%400 == 0){
			System.out.println("Given year is leap year");
		}else{
			System.out.println("Given year is not leap year");
		}
		 */
		scan.close();
	}

}
