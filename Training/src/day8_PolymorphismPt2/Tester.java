package day8_PolymorphismPt2;

public class Tester {
	public static void main(String[] args) {
		Dimension d1 = new Dimension();
		d1.length=10;
		d1.width=20;
		d1.area();
		
		
		//parent class! because it extends Dimension
		Rectangle r1 = new Rectangle();
		r1.length=100;
		r1.width=200;
	}
}
