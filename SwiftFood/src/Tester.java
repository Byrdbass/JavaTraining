
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food food1;
		food1 = new Food();
		//we can also just make it 
		//Food food1 = new Food();
		
		food1.foodName="Pizza";
		food1.cuisine= "Italian";
		food1.foodType="Appetizer";
		food1.quantityAvailable=50;
		food1.unitPrice=15;
		
		food1.display();
		
		Order order1 = new Order();
		order1.orderId=101;
		order1.orderedFoods="Spinach Alfredo Pizza";
		order1.status="Ordered";
		order1.calculateTotalPrice(35);
		
		order1.displayOrder();
		
		Restaurant Rest1 = new Restaurant();
		Rest1.restaurantName = "McDonalds";
		Rest1.rating = 4.1f;
		Rest1.restaurantContact = 998867676767L;
		Rest1.restaurantAddress = "SH1109, Carolina Street, Springfield";
		Rest1.displayRestaurantDetails();
		
		Customer c1 = new Customer("Jacob", "13th Street, New York", 5648394590L);
		c1.displayCustomerDetails();
		
		

	}

}
