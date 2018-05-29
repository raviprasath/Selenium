package week7homework;

import java.util.ArrayList;
import java.util.List;

public class SequenceNumber {

	public static void main(String[] args) {
		
/*		for (int i = 1; i <= 9; i++) { //till digit 9
			int number = i*10 + i; //2 digits
			number = number*10 + i; //3 digits
			System.out.print(number+"	");*/
		
		/*Write a simple Java program to print 111, 222, 333, 444, 555, 666, 777, 888, 999.
		for (int i = 1; i < 10; i++) {
			System.out.println(i+""+i+""+i);
		}*/
		
		int sum = 0;
		int input = 111;
		int max = 999;
	
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = input; sum<max; i++) {
			sum = sum + i;
			list.add(sum);
			input = --i;
			input = sum;
					}
		System.out.print(list);
	}
}
