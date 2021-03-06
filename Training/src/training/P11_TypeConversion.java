package training;

public class P11_TypeConversion {
	public static void main(String[] args) {
		
		//Implicit type conversion (from smallest to largest)
		/*
		 * byte
		 * short
		 * int (char)
		 * long
		 * float
		 * double
		 * */
		
		int x=5;
		double y=x;
		
		System.out.println(x);
		System.out.println(y);
		
		double a=56.7;
		int b=(int)a;  //Explicit Type Conversion - developer had to change the datatype
		System.out.println(b);
		
		
		int marks=25;
		int total=50;
		System.out.println(marks/total);
		System.out.println((double)marks/(double)total);
		
		double average = ((double)marks/(double)total)*100;
		System.out.println(average);
		
		short number = 32767; //maximum value
		short numberTwo = (short)(number + 1); 
		System.out.println(numberTwo); 
	}
}
