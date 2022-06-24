
public class Restaurant {
	String restaurantName, restaurantAddress;
	float rating;
	long restaurantContact;
	void displayRestaurantDetails() {
		System.out.println("Restaurant Details");
		System.out.println("*****************");
		System.out.println("Restaurant Name : " + restaurantName);
		System.out.println("Restaurant Rating : " + rating);
		System.out.println("Restaurant Contact : " + restaurantContact);
		System.out.println("Restaurant Address : " + restaurantAddress);
	};
}
