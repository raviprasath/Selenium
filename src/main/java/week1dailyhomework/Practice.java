package week1dailyhomework;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
int number =2, sum=0,count=0;
		while(count<10) {
			
		if(isPrimeNumber(number)) {
			sum = sum + number;
			count++;
		}
	number++;
	}
		System.out.println(sum);
	}
 public static boolean isPrimeNumber(int num) {
 
	 for(int i = 2; i<num/2;i++)
		 if (num %i ==0)
			 return false;
	 return true;
 }
 }
 