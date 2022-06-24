
public class Order {
	int orderId;
	String orderedFoods, status;
	double totalPrice;
	double calculateTotalPrice(int unitPrice) {
		double serviceCharge = unitPrice*0.05;
		totalPrice = serviceCharge+unitPrice;
		return totalPrice;
	}
	void displayOrder() {
		System.out.println("Order Details");
		System.out.println(orderId);
		System.out.println(orderedFoods);
		System.out.println(status);
		System.out.println("Total price: " + totalPrice);
		
	}
}
