package MethodExer1;

public class Calculator {
	public static double findAverage(int number1, int number2, int number3) {
		double avg = (double)(number1 + number2 + number3)/3;
		return Math.round(avg*100)/100.0;
	}

}
