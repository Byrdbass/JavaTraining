package day10_Interfaces;

//must have all methods in class that implements this interface

interface WaterBottleInterface {
	String color = "Blue";
	//by default these methods are all ABSTRACT AND PUBLIC
	void fillUp();
	void pourOut();
}

public class InterfaceEx1 implements WaterBottleInterface{

	public static void main(String[] args) {
		System.out.println(color);
		
		InterfaceEx1 ex = new InterfaceEx1();
		ex.fillUp();

	}
	//dynamic binding?
	@Override
	public void fillUp() {
		System.out.println("it is filled");
		
	}
	@Override
	public void pourOut() {
		// TODO Auto-generated method stub	
	}

}
