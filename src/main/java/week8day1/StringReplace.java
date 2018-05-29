package week8day1;

import java.util.Scanner;


public class StringReplace {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the user input: ");
		String input = scan.nextLine();
		scan.close();
		
		System.out.println("User inpnut: "+input);
		
		char[] charArray = input.toCharArray();
		String output = "";
		
		for (char c : charArray) {
			int n = c;
			n= n+1;
			c = (char)n;
			String charValue = Character.toString(c);
			output = output.concat(charValue);
		}
		System.out.println("User expected output: "+output);	
		
		
		
		/* String input1 = "x5";
		System.out.println("User inpnut: "+input1);
		
		String out = input1.replace('x', 'y');
		String out1 = out.replace('5', '6');
		
		System.out.println("User expected output: "+out1);
*/
	}
}