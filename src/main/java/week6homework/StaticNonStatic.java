package week6homework;

public class StaticNonStatic 
{

	//Declaring two variables
	public static String value1 = "Hello";
	public String value2 = " World";

	//Implementing static method
	public static String variable1() 
	{
		System.out.print(value1);
		return value1;
	}

	//Implementing non status method
	public String variable2() 
	{
		System.out.println(value2);
		return value2;
	}


	//implementing the main method to call both static and  non static method
	public static void main(String[] args) {

		StaticNonStatic calling = new StaticNonStatic();

		String name1 = StaticNonStatic.variable1();
		String name2 = calling.variable2();

		System.out.println(name1+name2);

	}
}

