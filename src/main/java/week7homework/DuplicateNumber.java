package week7homework;

import java.util.Set;
import java.util.TreeSet;

public class DuplicateNumber {

	public static void main(String[] args) {

		int a[]= {1,2,4,2,3,4,5,6,7,5};

		Set<Integer> duplicate = new TreeSet<>();

		for(int i = 0; i<a.length; i++) 
		{
			for(int j = 1; j<a.length; j++) 
			{
				if(a[i] == a[j] && i != j) 
				{
					duplicate.add(a[j]);
					break;

				}
			}
		}
		System.out.println("Duplicate Numbers are "+duplicate);
	}
}
