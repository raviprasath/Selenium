package week7homework;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Enter the first integer: ");
		int a = scan.nextInt();
		
		System.out.println("Enter the second integer: ");
		int b = scan.nextInt();
		
		System.out.println("Enter the third integer: ");
		int c = scan.nextInt();
		
		System.out.println("Enter the fourth integer: ");
		int d = scan.nextInt();
		
		System.out.println("Enter the fivth integer: ");
		int e = scan.nextInt();
		
		scan.close();
		
		int sum = a + b + c + d + e;
		
		System.out.println("Given sum of integer sum of value is "+sum);
		
		int sumTwo = a + b + c + d + e + sum ;
		System.out.println("Sum of the interger with sum of their number is "+sumTwo);
		
		System.out.println("Dividing the sum of integer and their total by 2 and the result is "+sumTwo / 2);
		
		if(sum == sumTwo)
			System.out.println(sum+" is a perfect number");
		else
			System.out.println(sum+" is a not perfect number");

	}

}
