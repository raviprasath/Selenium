package week3homework;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the input number for the Floyd Triangle rows: ");
		int num = scan.nextInt();

		int n=1,i,j;

		for(i=1 ; i<=num ; i++)
		{
			for(j=1;j<=i;j++) {
				System.out.print(n+" ");
				n++;
			}
			
			System.out.println();
		}
		scan.close();
	}

}
