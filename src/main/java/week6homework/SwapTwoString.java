package week6homework;


public class SwapTwoString {

	public static void main(String[] args) {


		//Initialize two string values
		String data1 = "Good";

		String data2 = "day";

		System.out.println("Before swap:"+data1+" "+data2);

		
		//Performing action to swap two string values
		data1 = data1 + data2;

		data2 = data1.substring(0, data1.length() - data2.length());

		data1 = data1.substring(data2.length());

		
		//Print the two string values after the swap
		System.out.println("Aftter swap:"+data1+" "+data2);
	}

}
