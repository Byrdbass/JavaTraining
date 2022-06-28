package day6_StaticVar;

public class Tester {

	public static void main(String[] args) {
		Customer c1 = new Customer("Jimmy");
		c1.display(); //will not increment the custid!
		Customer c2 = new Customer("Jimmy2");
		c2.display();
		Customer c3 = new Customer("Jimmy3");
		c3.display();
		Customer c4 = new Customer("Jimmy4");
		c4.display();
		Customer c5 = new Customer("Jimmy5");
		c5.display();
		
		System.out.println(c1.counter2); //will always be the last value = 5, because this is a shared variable
		//it does not belong to a certain particular object
		
		Customer2 cus1 = new Customer2("Z");
		Customer2 cus2 = new Customer2("Z");
		Customer2 cus3 = new Customer2("Z");
		Customer2 cus4 = new Customer2("Z");
		Customer2 cus5 = new Customer2("Z");
		Customer2 cus6 = new Customer2("Z");
		Customer2 cus7 = new Customer2("Z");
		Customer2 cus8 = new Customer2("Z");
		Customer2 cus9 = new Customer2("Z");
		Customer2 cus10 = new Customer2("Z");
		Customer2 cus11 = new Customer2("Z");
		Customer2 cus12 = new Customer2("Z");
		cus10.display();
		cus12.display();
		
		
		

	}

}
