package week1day2;

public class First100OddNumberDesendingOrder {

	public static void main(String[] args) {
		int inputNumber = 199;
		int i;
		System.out.println("The first 100 odd numbers are");
		for(i=inputNumber;i>=0;i--)
		{
			if(i%2 !=0)
			{
				System.out.println(i);
			}
		}

	}

}
