package week4homework;

public class MultipliesOf3Or5 {

	public static void main(String[] args) {

		int input =100;
		int sumOfDigits = 0;

		System.out.print("The multiplies of 3 or 5 less than 100 are: ");
		for(int i=1; i<input;i++) {
			if(i%3==0 || i%5==0) {
				System.out.print(i+",");
				sumOfDigits=i+sumOfDigits;
			}
		}
		System.out.println();
		System.out.println("Their Sum of digits: "+sumOfDigits);
	}

}
