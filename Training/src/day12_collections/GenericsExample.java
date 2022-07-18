package day12_collections;

import java.util.ArrayList;

public class GenericsExample {

	public static void main(String[] args) {
		//Printer<T> printer = new Printer(69);
		//this is a raw type and needs a specific type to print!
		Printer<Integer> printer = new Printer(69);
		printer.print();
		Printer<String> stringPrinter = new Printer("Hey yo!");
		stringPrinter.print();
		Printer<Double> doublePrinter = new Printer(45.02);
		doublePrinter.print();
		
		//we can also do this with Collection framework!
		ArrayList<Cat> cats = new ArrayList<>();
		cats.add(new Cat("fluffy", "brown"));
		//cats.add(new Dog("Rover", "black"));
		//compilation error as Dog cannot be resolved to a type
		
		//to be able to create a list of anything we want
		// it won't be type safe
		// this is what we do if generics didn't exist
		ArrayList<Object> kitties = new ArrayList<>();
		kitties.add(new Cat("Frisco", "Grey"));
		Cat myCat = cats.get(0);
		//THIS ABOVE IS BAD PRACTICE
		//WE SHOULD USE A CLASS INSTEAD OF AN OBJECT
		
		
		
		ArrayList<Game> game = new ArrayList<>();
		game.add(new Game("Megaman2", "NES"));
		game.add(new Game("Super Mario Bros. 3", "NES"));
		
		
		


	}

}
