
public class Food {
	String foodName;
	String cuisine;
	String foodType;
	int quantityAvailable;
	double unitPrice;
	
	public void display() {
		System.out.println("name of food is " + foodName);
		System.out.println("name of cuisine " + cuisine);
		System.out.println("type of food " + foodType);
		System.out.println("We have " + quantityAvailable + " available");
		System.out.println(foodName + " is " + unitPrice + " dollars");
		
	}

}
