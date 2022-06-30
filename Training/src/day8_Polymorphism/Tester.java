package day8_Polymorphism;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Demo1 d1 = new Demo1();
		//THE COMPILER IS MAKING A DECISION ON WHICH METHOD IS BEING INVOKED
		//NOT THE RUN TIME ENVIRONMENT
//		d1.add(10, 20);
//		d1.add(10.4 ,30);
//		d1.add(10,20,30);
		
		Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);
                                
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));

	}

}
