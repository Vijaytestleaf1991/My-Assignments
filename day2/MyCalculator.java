package week1.day2;

public class MyCalculator {
	
	public static void main(String[] args) {
		
		 Calculator cal= new Calculator();
		 int add = cal.add(2, 2, 2);
		 System.out.println(add);
		 int sub = cal.sub(10, 5);
		 System.out.println(sub);
		 double multiple = cal.multiple(10, 10);
		 System.out.println(multiple);
		 float divide = cal.divide(10, 2);
		 System.out.println(divide);
	}
	
	

}
