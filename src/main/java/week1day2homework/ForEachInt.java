package week1day2homework;

public class ForEachInt {

	public static void main(String[] args) {
		//assigning marks
		int[] subjectMarks = {34,35,36,74,53,02,45,67,67,98,34};

		System.out.println("Subject marks with status are below:");
		
		//implementing the for each loop and checking the marks
		for(int mark:subjectMarks)
		{
			if(mark >= 35)
				System.out.println(mark+" is Pass mark");
			else
				System.out.println(mark+" is Fail mark");

		}
	}

}
