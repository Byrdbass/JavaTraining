
public class QuizDataTypes {
	public static void main(String[] args) {
		int time = 5;
		float rate = 10f;
		double principal = 5000;
		
		double si = (principal*rate*time)/100;
		System.out.println(si);
		
		//would work if time was in years BUT NOT MONTHS
		byte time2 = 3;
		float rate2 = 7f;
		int principal2 = 3250;
		System.out.println((principal2*rate2*time2)/100);
	}
}
