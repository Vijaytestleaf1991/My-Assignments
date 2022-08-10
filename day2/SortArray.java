package week1.day2;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
		int[] number= {22,67,97,1,34,58,99};
		int length = number.length;
		System.out.println(length);
		for (int i = 0; i < length; i++) {
			System.out.println(number[length-1]+i);
				}	
		Arrays.sort(number);
		for (int i = 0; i < length; i++) {
			System.out.println(number[i]);
		
		
					}
		}
			
		
		
		
		 
	}


