
public class IterationControlStructureQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 1, j = 10;
//		do {
//			j--;
//		} while (++i < 5);
//		System.out.println("i = " + i + " and j = " + j);
		
//		int sum = 0;
//		for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1) {
//			sum += i;
//		}
//		System.out.println(sum);
		
//		for (int i = 0; i < 3; i++) {
//			switch (i) {
//			case 0:
//			case 1:
//				System.out.println("One ");
//				break;
//			case 2:
//				System.out.println("Two ");
//			}
//		}
		
//		int counter = 1;
//		while (counter < 3) {
//			counter = counter + 1;
//			System.out.println(counter);
//		}
//		
//		int number = 28;
//		for (int num = 25; num < 30; num++) {
//			if (number > num) {
//				System.out.println(num);
//			} else {
//				System.out.println(num);
//				break;
//			}
//		}
		
//		int num1 =16;
//		int num2 =6;
//		while (num1 >= 2) {
//			if (num1 > num2) {
//				num1 = num1 / 2;
//			} else {
//				System.out.println(num1);
//				break;
//			}
//		}
		
//		int counter = 0;
//		while (counter <= 7) {
//			if (counter % 2 == 0) {
//				counter += 1;
//				continue;
//			} else {
//				counter += 1;
//			}
//			System.out.println(counter);
//		}
//		
//		int i = 0;
//		for (; i <= 3; i++) {
//			if (i++ % 2 == 0) {
//				System.out.println("i = " + i);
//			}
//		}
//		System.out.println("i after the loop = " + i);
		
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < 5; i++) {
			if ((++num1 > 2) && (++num2 > 2)) {
				num1++;
			}
		}
		System.out.println(num1 + " and " + num2);
		
		for (int i = 2; i >= i % 2; i--) {
			System.out.println(i);

		}

	}

}
