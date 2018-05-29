package week1dailyhomework;

public class LogicalOperatorLearn {

	public static void main(String[] args) {
		//Assigning the input value 
		int a=2;
		int b=5;
		boolean multiply = true;
		
		// Boolean conditions
		if(!(a<b))
			System.out.println("a is greater than b");
		else
			System.out.println("a is not greater than b and it is "+multiply+" for condition");

		//Using of && operator
		if(a==2 && b++ == 5)
			System.out.println("The both conditions are true");
		else
			System.out.println("Any one the condition or both the conditions are false");

		if(--a ==1 &&  b++ ==7)
			System.out.println("The both conditions are true");
		else
			System.out.println("Any one the condition or both the conditions are false");


		//Using of || operator
		if(a==2  || ++b ==6)
			System.out.println("The both the conditions are true or any one condition is true");
		else
			System.out.println("The both the conditions are false");

		if(a-- == 0 || ++b ==9 )
			System.out.println("The both the conditions are true or any one condition is true");
		else
			System.out.println("The both the conditions are false");

	}

}
