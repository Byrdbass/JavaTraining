package day4_constructor;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Employee e1 = new Employee(); //throw an error because i had a parametrized constructor
		//Java will not create a default constructor if you have a parameterized one
		
		Employee e1 = new Employee(10, "Jimmy", "engineer", 57000);
		e1.display();
	}

}