package week1.day2;

public class Car {	
	
	public void carbrand() {
		System.out.println("Hyundai");
	}
	
	public String getColor () {
		return "Red";
	}
	
	public String getEngineNumber () {
		return "TN122334";
				
	}
	
	public int subOfNumbers (int a, int b) {
	 int c = a-b;
	 return c;

}
	
	public static void main(String[] args) {
		
		Car car = new Car ();
		car.carbrand();		
		String color = car.getColor();
		System.out.println(color);
		String engineNumber = car.getEngineNumber();	
		System.out.println(engineNumber);
		int subOfNumbers = car.subOfNumbers(10, 6);
		System.out.println(subOfNumbers);
		
		
		
			}}	
		
		
						
