package week1.day2;

public class PrimeIn {
	
	public static void main(String[] args) {
		
		int n=11;
		for (int i=2; i<=n-1;) {
		if (n % i== 0) {
			System.out.println(n+"is  not a prime number");
		} else {
				System.out.println(n+"is prime number");
		}	
		break;	
			
		}
	}

}
