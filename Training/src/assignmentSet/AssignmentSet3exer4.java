package assignmentSet;

public class AssignmentSet3exer4 {
	
	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];
		int[] isTwoDigitPositive;
		//range <100 && >=10;
		
		if (num1<num2) {
			int index = 0;
			for(int i = num1; i<num2 ; i ++) {
				int num = i;
				int temp = num;
				int total = 0, rem = 0;
				
				//cycle through the numbers that are two digits
				while (num>0) {
					rem = num %10;
					total += rem;
					num = (int)(num/10);
				}
				if (total %3 ==0) {
					if (temp>9 && temp<=99) {
						if(temp %5 ==0) {
							numbers[index] = temp;
							index +=1;
						}
					}
				}
			}
			
		}

		// Implement your code here

		return numbers;
	}

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 30;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}
		

	}

}
