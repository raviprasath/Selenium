package week2dailyhw;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		//Initialize two values with variables
		int a=2, b=3;
		//Before swapping
		System.out.println("Before swapping:");
		System.out.println("Value of a  is "+a);
		System.out.println("Value of b  is "+b);

		//Swapping number
		a=a+b;
		b=a-b;
		a=a-b;

		//After swapping
		System.out.println();
		System.out.println("After swapping:");
		System.out.println("Value of a  is "+a);
		System.out.println("Value of b  is "+b);	
	}

}
