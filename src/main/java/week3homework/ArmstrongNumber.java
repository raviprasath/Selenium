package week3homework;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// initialize the input numbers
		int inputNumber1=100, inputNumber2=1000;
		int i, total=0;
		System.out.println("The armstrong numbers in between 100 to 1000 are: ");		
		for (i=inputNumber1; i<=inputNumber2; i++)
		{
			while(i>0)
			{
				int quotient = i%10;
				i=i/10;
				total = total+(quotient*quotient*quotient);
			}
			if (i==total)
				System.out.print(i);
		}

	}

}
