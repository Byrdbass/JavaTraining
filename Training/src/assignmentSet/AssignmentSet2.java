package assignmentSet;

public class AssignmentSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "46763", reverseStr = "";
		int strLength = str.length();
		
		for (int i = (strLength-1) ; i >=0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}
		
		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " is a palindrome");
		}
		else {
			System.out.println(str + " is not a palindrome");
		}
		
		/////////////////////////////////////////////////
		//given heads and legs - 2 legs per chicken, 4 legs for rabbits?
		int heads = 150, legs = 500, chickens = 0, rabbits = 0;
		
		if (legs % 2 != 0) {
			System.out.println("The number of chickens and rabbits cannot be found");
		}
		else {
			rabbits = legs/4;
			chickens = heads - rabbits;
			System.out.println("Chickens="+chickens);
			System.out.println("Rabbits="+rabbits);
		}
		///////////////////////////////////////////////
		int numOne = 123;
		int staticNum = 123;
		int sumOfDigits = 0;
		int remainder = 1;
		int lastDigit = 0;
		
		while(numOne>0) {
			lastDigit=numOne%10;
			sumOfDigits=sumOfDigits + lastDigit;
			numOne=numOne/10;
			//System.out.println(lastDigit);
			//System.out.println("sum is"+sumOfDigits);		
		}
		
		remainder = staticNum%sumOfDigits;
		System.out.println(remainder);
		if (remainder == 0) {
			System.out.println(staticNum + " is divisible by sum of it's digits");
		}
		else {
			System.out.println(staticNum + " is not divisible by sum of it's digits");
		}
		//////////////////////////////////////////////
	
			//int temp;
			int number = 1634;
			//int numberCopy=number;
			//int digits = 0;
//			while(numberCopy != 0 ) {
//				numberCopy /= 10;
//				++digits;
//			}
			//System.out.println(digits);
			//System.out.println(number);
			//ArmstrongNum armstrong = new ArmstrongNum();
			//System.out.println(armstrong.isArm(numberCopy));
			
			int temp, digits=0, last=0, sum=0;
			temp = number;
			while (temp>0) {
				temp = temp/10;
				digits++;
			}
			temp = number;
			while (temp>0){
				last = temp %10;
				sum += (Math.pow(last,digits));
				temp = temp/10;
			}
			if (number==sum)
				System.out.println(number+ " is a an Armstrong number");
			else 
				System.out.println(number+ " is not a an Armstrong number");
			
		}
		//////////////////////////////////////////////

	
	
	}


