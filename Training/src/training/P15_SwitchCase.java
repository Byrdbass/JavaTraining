package training;

public class P15_SwitchCase {
	public static void main(String[] args){
		String day="Tue";
		
		switch (day) {
		
		//without "break" it will fallthrough and print everything below the satisfied condition
		
		//this is much faster than an if else if line of methods
		
		//this is refered to as index tabling!
		
		case("Sun"):
			System.out.println("Today is Sunday");
			break;
		case("Mon"):
			System.out.println("Today is Monday");
			break;
		case("Tue"):
			System.out.println("Today is Tuesday");
			break;
		case("Wed"):
			System.out.println("Today is Wednesday");
			break;
		case("Thu"):
			System.out.println("Today is Thursday");
			break;
		case("Fri"):
			System.out.println("Today is Friday");
			break;
		case("Sat"):
			System.out.println("Today is Saturday");
			break;
		default:
			System.out.println("Invalid Input");
		
		}
	}

}
