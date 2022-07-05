package day10_Interfaces;

public class Tester {

	public static void main(String[] args) {

		inter1 c2 = new Class1(); //this is dynamic binding - cannot create a object from an interface
		Class1 c1 = new Class1();
		
		c1.display();
		System.out.println(c1.area());
		

	}

}
