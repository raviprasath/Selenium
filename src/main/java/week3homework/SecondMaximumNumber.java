package week3homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondMaximumNumber {

	public static void main(String[] args) {

		//Initialize the Array Integer 
		int intArray[] = {20,340,21,849,92,21,474,83647,-200};

		//Convert Array to list integer
		List<Integer> orderNumber=new ArrayList<>(intArray.length);

		//add the all the value in the list
		for(int i : intArray)
		{
			orderNumber.add(Integer.valueOf(i));
		}

		//Sort the list and getting the proper order
		Collections.sort(orderNumber);
		System.out.println("Given integer order list is"+orderNumber);

		//Find the length of the list and display the last previous number
		int secondLargestNumber = orderNumber.size();
		System.out.println("The second largest number is "+orderNumber.get(secondLargestNumber-2));
		
		//Another and finest model
		int first = intArray[0];
		int second = intArray[0];

		for(int i=0; i<intArray.length;i++)
		{			
			if(intArray[i]>first)
			{
				second=first;
				first=intArray[i];
			}
			else if(intArray[i]>second)
			{
				second=intArray[i];
			}

		}
		System.out.println("The second largest number is "+second);
	}
}
