package day6_StaticVar;

public class Customer {
	String custid;
	private String custname;
	
	
	int counter=0; //will not increment because it is an instance variable
	static int counter2=0; // class level variable
	
	static //static "block" to create any number of static variables
	{
		int counter3=0;
		System.out.println("I am in static block");
	}
	
	
	public Customer(String custname) {
		this.custid="C00" + ++counter2;
		this.custname = custname;
		System.out.println("I am in constructor");
		
	}
	
	void display() {
		System.out.println(this.custid);
		System.out.println(this.custname);
	}
	

}
