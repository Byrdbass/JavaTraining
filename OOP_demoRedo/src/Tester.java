
public class Tester {
	public static void main(String[] args) {
		
		//customer1 - these are reference variables
		Customer customer1;
		customer1 = new Customer(); //object of the class - CREATING A NEW INSTANCE OF THE CLASS
		
		//using dot notation to access the instance variables
		customer1.custId=1001;
		customer1.name="Parimala";
		customer1.phone=2142136486;
		customer1.address="Raleigh";
		
		Customer customer2 = new Customer();
		customer2.custId=1002;
		customer2.name="Sharad";
		customer2.phone=2142136487;
		customer2.address="asdasdas";
		
		System.out.println(customer1);
		System.out.println(customer1.name);
		
		customer1.display(); //invoking the method
		
		
		
		
	}

}
