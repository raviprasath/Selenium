package week5homework;

import java.util.Scanner;

public class MatrixContainsSpiral {

	public static void main(String[] args) {
		//Initialize scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = scan.nextInt();

		System.out.println("Enter the number of columns: ");
		int column = scan.nextInt();

		int[][] matrix = new int[row][column];

		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.println("Enter the number for row " + i + " and column " + j + " : ");
				matrix[i][j] = scan.nextInt();
			}	
		}

		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();

		//spiral print
		int a=0; //Row minimum index value
		int b=3; //Row maximum index value
		int c=0; //Column minimum index value
		int d=3; //Column maximum index value

		while(a<b && c<d) {
			//printing first row
			for(int e=c;e<d;++e) {
				System.out.print(matrix[a][e]+" ");
			}
			a++;
		}
		//printing last column
		for(int f=a;f<b;++f) {
			System.out.print(matrix[f][d-1]+" ");
		}
		d--;

		if(a<b) {
			for(int x=d-1;x>=c;--x) {
				System.out.print(matrix[b-1][x]+" ");
			}
			b--;
		}
		if(c<d) {
			for(int y=b-1;y>=a;--y) {
				System.out.print(matrix[y][c]+" ");
			}
			c++;
		}

	}

}