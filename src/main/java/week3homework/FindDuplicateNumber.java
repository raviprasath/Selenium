package week3homework;

import java.util.TreeSet;

public class FindDuplicateNumber {

	public static void main(String[] args) {

		int input[] = {13,65,15,67,88,65,13,99,67,13,65,87,13};
		TreeSet<Integer> findDuplicate = new TreeSet<Integer>();

		System.out.println("The duplicate numbers are: ");
		for(int i=0;i<input.length;i++)
		{
			for(int j=1;j<input.length;j++)
			{
				if(input[i] == input[j] && i != j)
				{
					findDuplicate.add(input[i]);
					break;
				}

			}
		}
		System.out.print(findDuplicate);
	}

}
