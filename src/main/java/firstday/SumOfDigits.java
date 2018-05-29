package firstday;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		int inputNumber = 1234;
		int sumOfDigits = 0;
		int copyinputNumber = inputNumber;
		
		while (inputNumber !=0)
		{
		int Quotient = inputNumber / 10;
		int Remainder = inputNumber % 10;
		sumOfDigits = sumOfDigits + Remainder;
		inputNumber=Quotient;
		
		}
		
		System.out.println("Sum of digits of " + copyinputNumber +" is "+ sumOfDigits);
	}

}
