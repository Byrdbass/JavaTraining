package day8_PolymorphismPt2;

public class Rectangle extends Dimension {
	
	
	@Override 
	public void area() {
		//THIS IS OVERIDDING!
		System.out.println("area: " + this.length*this.width);
		super.area(); //this will show the parent class method
	}

	void rectDisplay() {
		this.area(); // will call it's own method here in Rectangle
		System.out.println("i am in rectangle class display");
	}

}
