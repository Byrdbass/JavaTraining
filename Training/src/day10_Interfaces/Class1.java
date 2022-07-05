package day10_Interfaces;


// a class can implement from more than one interface!
// a class can only extend from ONE other class!
public class Class1 implements inter1 {

	@Override
	public void display() {
		System.out.println("Display method");
		
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return inter1.i;
	}

}
