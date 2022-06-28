package day6_Strings;

public class StringsInMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Max";
		String newName = "Max";
		
		System.out.println(name == newName); //return true because it is still in the string constant pool with same location
		
		String name1 = new String("Bob");
		String newName1 = new String("Bob"); // two different places in memory
		System.out.println(name1 == newName1); //return false
		
		//STRING METHODS
		String fname = "Bobby";
		String lname = "Hill";
		
		System.out.println(fname.length());
		System.out.println(fname.concat(lname)); //will return a new String because they are immutable in memory
		System.out.println(fname + " " + lname); //will do the same thing but with a space
		
		String name2 = "Jimmy";
		String newName2 = new String("Jimmy");
		System.out.println("==" + name2==newName2); //compares memory location
		System.out.println("equals" + name2.equals(newName2)); //compares the value 
		System.out.println("equals" + name2.equalsIgnoreCase(newName2)); //compares value and ignoring case4
		
		String name3 = "LELAND";
		name3.toLowerCase(); // will create a new String object in lowercase - can be stored in a new variable
		System.out.println(name3.charAt(1)); // will return the index at the parameter location
		System.out.println(name3.substring(0,1)); // returns index of a string starting with first value/parameter, and ending on second value/parameter
		
		//STRING CONTAINS
		
		//STRING REPLACE
		
		
	}

}
