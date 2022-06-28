package day5_encap;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(10,20);
		
		r1.area();
		
		r1.setLength(100);
		r1.setWidth(200);
		r1.area();
		
		Class1 c1 = new Class1();
		System.out.println(c1.i); //public
		//System.out.println(c1.j); private
		
		System.out.println(c1.k); //protected - accessible
		System.out.println(c1.l); //default);
		
		

	}

}
