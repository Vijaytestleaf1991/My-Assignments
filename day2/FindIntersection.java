package week1.day2;

import java.util.Arrays;

public class FindIntersection {
	
	public static void main(String[] args) {
	int [] num1= {3,2,11,4,6,7};
	int [] num2= {1,2,8,4,9,7};
	Arrays.sort(num1);
	int length1 = num1.length;
	Arrays.sort(num2);
	int length2 = num2.length;
	for (int i=0;i<length1; i++) {
		for (int j=0; j<length2; j++) {
			if (num1 [i]==num2 [j]) {
				System.out.println(num1 [i]);
				
			}
		}
		
	}
	}

}
