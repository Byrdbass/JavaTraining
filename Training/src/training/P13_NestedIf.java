package training;

public class P13_NestedIf {
	public static void main(String[] args) {
		
		short marks=90;
		char behav='B';
		
		if(marks>75) {
			if(behav=='A') {
				System.out.println("good marks and good character");
			}
			else {
				System.out.println("good Marks and Naughty in the class");
			}
		}
		else {
			
			if(behav=='A') {
				System.out.println("Low marks and good character");
			}
			else {
				System.out.println("Low Marks and Naughty in the class");
			
			}
		}
	}
}
