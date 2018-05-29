package week7homework;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the input for start pattern: ");
		int input = scan.nextInt();

		scan.close();

		int n=1, i, j;

		for(i=1; i<= input; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(n+" ");
			}
				for(int k=1;k<(i*2);k++)
				{
					System.out.print("i");
				}
				System.out.println();
			}
		
	}

}
