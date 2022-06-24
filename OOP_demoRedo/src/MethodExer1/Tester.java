package MethodExer1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 12, number2 = 8, number3 = 15;
		Calculator Avg1 = new Calculator();
		
		double result = Calculator.findAverage(number1,number2,number3);
		System.out.println(result);
		
	}

}
