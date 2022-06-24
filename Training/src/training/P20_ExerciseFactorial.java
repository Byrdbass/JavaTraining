package training;

public class P20_ExerciseFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=7;
		int factorial=1;
		
		while(x>0) {
			factorial= factorial*x;
			x--;
		}
		System.out.println(factorial);
	}

}
