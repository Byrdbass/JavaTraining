package day8_Polymorphism;

public class Demo1 {
	
	//THIS IS METHOD OVERLOADING - you have different forms/"signatures" of the same method
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	//same name AND same signiture
//	void add(int a, int b)
//	{
//		return(a+b);
//	}

	void add(double a, double b)
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}
