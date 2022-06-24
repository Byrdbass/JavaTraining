
public class Customer {
	String customerName, address;
	long contactNumber;
	String ID;
	

	public Customer(String customerName, String address, long contactNumber) {
		this.customerName = customerName;
		this.address = address;
		this.contactNumber = contactNumber;
	}
	
	void displayCustomerDetails(){
		System.out.println("Displaying Customer details");
		System.out.println("Customer Id: " + ID);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Contact Number: " + contactNumber);
		System.out.println("Address: " + address);
	}
	

}
