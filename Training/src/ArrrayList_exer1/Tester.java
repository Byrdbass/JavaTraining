package ArrrayList_exer1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Tester {
		 public static List<String> getItems(List<Order> orders) {
				//Implement your logic here and change the return statement accordingly
			ListIterator<Order> order = orders.listIterator();
			List<String> itemsList = new ArrayList<String>();
			
			while(order.hasNext()) {
				itemsList.addAll(order.next().getItemNames());
			}
			return itemsList;
			}
		    
			public static void main(String[] args) {
				List<Order> orders = new ArrayList<Order>();

				List<String> items1 = new ArrayList<String>();
				items1.add("FriedRice");
				items1.add("Pasta");
				items1.add("Tortilla");
				orders.add(new Order(101, items1, true));

				List<String> items2 = new ArrayList<String>();
				items2.add("Pizza");
				items2.add("Pasta");
				orders.add(new Order(102, items2, true));

				List<String> items3 = new ArrayList<String>();
				items3.add("Burger");
				items3.add("Sandwich");
				items3.add("Pizza");
				orders.add(new Order(103, items3, true));

				List<String> items = getItems(orders);
				System.out.println("List of Items:");
				for (String item : items) {
					System.out.println(item);
				}
	}

}
