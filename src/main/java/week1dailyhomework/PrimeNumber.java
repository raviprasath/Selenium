package week1dailyhomework;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//Implementing scanner class
		Scanner obj1= new Scanner(System.in);
		System.out.println("Enter the user input:");
		int number=obj1.nextInt();
		
			if (isPrime(number))
		{
			System.out.println("Entered number is "+number+" - A Prime number");
		}
		else
		{
			System.out.println("Entered number is "+number);
		}
		obj1.close();
	}

	public static boolean isPrime(int number) {
		if(number<=1)
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(number);i++)
			if(number%i==0)
			{
				return false;
			}
		
		return true;
	}
}
