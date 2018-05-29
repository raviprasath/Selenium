package week5homework;

import java.util.Scanner;

public class UniqueeCharacters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the string input: ");
		String text = scan.nextLine();

		scan.close();

		uniqueeCharacters(text);
	}

	private static void uniqueeCharacters(String text) {
		String temp = "";
		for (int i = 0; i < text.length(); i++){
			if (temp.indexOf(text.charAt(i)) == - 1){
				temp = temp + text.charAt(i);

			}
		}
		System.out.println("Unique charcters in given input is: "+temp);
	}
}
/*
Scanner scan = new Scanner(System.in);
System.out.println("Enter the input String: ");
String input = scan.nextLine();
scan.close();

//create a set & an object
List<Character> unique = new ArrayList<Character>();

//iterate through each character of the string
String lowerCase = (input.replaceAll("\\s","")).toLowerCase();
for (int i = 0; i < lowerCase.length(); i++) {
if (!unique.contains(lowerCase.charAt(i))) //checks for duplicate
unique.add(lowerCase.charAt(i));//adds character to the set
}

//print each character in the list to form a unique string
for (Character character : unique) {
System.out.print(character);
}
}
}*/