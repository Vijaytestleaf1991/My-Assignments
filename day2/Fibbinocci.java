package week1.day2;

public class Fibbinocci {
	
	/* Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
	*Print first number
	Iterate from 1 to the 11
	Add first and second number assign to sum
	Assign second number to the first number
	Assign sum to the second number
	Print sum
	*/
	
	public static void main(String[] args) {
		int firstNum = 0, secondNum = 1, sum=0;
		for (int i=1; i<11; i++) {
		System.out.println(firstNum);
		sum = firstNum + secondNum;
		firstNum = secondNum;
		secondNum = sum;
		System.out.println(sum);
				
				
	}

}}
