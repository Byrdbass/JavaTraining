package day5_encap;

public class Rectangle {
	
	//anything private is only accessed within this class
	private int length;
	private int width;
	
	// a constructor will allow access to these private instance variables
	Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	
	//using setters and getters to be able to change values in main method
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	

	
	public void area() {
		System.out.println(this.length * this.width);
	}


}
