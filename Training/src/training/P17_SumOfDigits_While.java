package training;

public class P17_SumOfDigits_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 4567;
		int sum=0;
		
		int lastdigit=0;
		
		// we need to get 4567 -> 7
		//4567 % 10 = 7
		// 456 % 10 = 6
		// 45 % 10 = 5
		// 4 % 10 = 4
		
		
		while(input>0) {
			lastdigit=input%10;  //7
			sum=sum + lastdigit; // 7
			input = input/10; //456
			
		}
		System.out.println("Sum is " + sum);
		

	}

}
