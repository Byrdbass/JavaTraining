
public class Customer {
	//creating instance variables/attributes  (WE HAVE NOT MADE AN INSTANCE OF CUSTOMER ITSELF)
	
	//ACCESS MODIFIER PUBLIC IS ADDED SO WE HAVE ACCESS TO THESE VARIABLES OUTSIDE OF THE CLASS
	public int custId;
	public String name;
	public long phone;
	public String address;
	
	Customer() //parameter-less constructor
	{
		custId = 1000;
		name = "john";
		phone = 0202020;
		address = "Boston";
	}
	
	
	public Customer(int custId, String name, long phone, String address) {
		super();
		this.custId = custId;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}


	public void display() {
		System.out.println("Customer id " + custId);
		System.out.println("Customer name " + name);
		System.out.println("Customer phone " + phone);
		
	}
	
	
	

}
