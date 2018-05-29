package week1dailyhomework;

import java.util.Scanner;

public class ArrayAnd2DArray {

	public static void main(String[] args) {

		//declaring single array
		int[] intArray = {1,2,3,4};

		System.out.println("Single dimential array is "+intArray[0]+" , "+intArray[1]+" , "+intArray[2]+" , "+intArray[3]);

		//declaring 2D Array and getting input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows: "); 
		int rows = scan.nextInt();
		System.out.println ("Now enter the number of columns: "); 
		int columns=scan.nextInt();

		int[][] matrix = new int[rows][columns];
		for(int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {

				System.out.println("Enter the number for row " + i + " and column " + j + " : ");
				matrix [i][j] = scan.nextInt();	
			}
		}
		System.out.println("2D dimential arraynwith matrix is below:");
		for(int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}