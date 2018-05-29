package firstday;

public class ControlFlowNestedIf {

	public static void main(String[] args) {
		int age = 18;
		if (age > 50)
			if(age>=20)
			{
				System.out.println("The given age is greater than 20 and less than 50");
			}
			else {
				System.out.println("The given age is less than 20");
			}
		if (age>15)
			if(age<17)
			{
				System.out.println("The given age is less than 17");
			}
			else
			{
				System.out.println("The given age is greater than 17 but less than 20");	
			}

	}

}
