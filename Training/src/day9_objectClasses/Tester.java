package day9_objectClasses;

public class Tester {

	public static void main(String[] args) {
		Food foodOne = new Food();
		foodOne.setFoodName("Sandwich");
		foodOne.setCuisine("Continental");
		foodOne.setFoodType("Veg");
		foodOne.setQuantityAvailable(100);
		foodOne.setUnitPrice(10);

		Food foodTwo = new Food();
		foodTwo.setFoodName("Sandwich");
		foodTwo.setCuisine("Continental");
		foodTwo.setFoodType("Veg");
		foodTwo.setQuantityAvailable(200);
		foodTwo.setUnitPrice(10);

//		if (foodOne == foodTwo) {
//			System.out.println("The food objects are same!");
//		} else {
//			System.out.println("The food objects are different!");
//		}
		
		System.out.println(foodOne==foodTwo); //checking if they are the same in memory
		System.out.println(foodOne.equals(foodTwo));  //equals method is inherited by the food class
		
		String name = "Parimala";
		String name1 = "Parimala"; //could also be new String("Parimala")
		
		System.out.println(name.equals(name1));  //OBJECT OF STRING CLASS - this will print true because the String class is different and has been overriden 
		
				

	}

}
