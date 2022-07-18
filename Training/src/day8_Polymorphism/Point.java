package day8_Polymorphism;

public class Point {
	private double xCoordinate;
	private double yCoordinate;
	

	//constructor
	public Point(double xCoordinate, double yCoordinate) {
		super();
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	public double calculateDistance() {
		
		double xOrigin = 0.00;
		double yOrigin = 0.00;
		//THIS IS THE SAME CALCULATION AS Math.sqrt
		double distance = Math.sqrt(Math.pow((this.xCoordinate-xOrigin), 2) + Math.pow((this.yCoordinate-yOrigin), 2));
		return Math.round(distance*100)/100.0; 
	}
	
	public double calculateDistance(Point point) {
		double distance = Math.sqrt(Math.pow((point.xCoordinate-this.xCoordinate), 2) + Math.pow((point.yCoordinate-this.yCoordinate), 2));
		return Math.round(distance*100)/100.0; 
	}


	//getters and setters
	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	
}
