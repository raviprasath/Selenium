package week1dailyhomework;

public class FibonacciSeries {

	public static void main(String[] args) {
		//Declering input 
		int inputNumber1=0;
		int inputNumber2=1;
		int fibonacciSeries = 0;

		System.out.println("Fibonacci Series upto 100 are: ");

		//Initializing for and while loop to know the exact 100

		for (int i=0;i<100;) 
		{
			while(inputNumber1 <=100)
			{
				System.out.println(inputNumber1);
				fibonacciSeries=inputNumber1+inputNumber2;
				inputNumber1=inputNumber2;
				inputNumber2=fibonacciSeries;

			}
			System.out.println("For loop is empty hence closing this");
			break;
		}
	}
}