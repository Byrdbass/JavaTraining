
public class SelectionControlStructureQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = true;
		boolean y = false;
		if (x && y) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

//		int a = 12 * 3 - 9 / 2;
//		int b = 14 * 4 + 175 / 8;
//		if (a++ % 2 == 0) {
//			if (b-- % 4 == 0) {
//				System.out.println("a = " + a + " b = " + b);
//			} else {
//				System.out.println("a = " + a + " b = " + b);
//			}
//		} else {
//			System.out.println("a = " + a + " b = " + --b);
//		}
		
		
//		int num1 = 0;
//		int num2 = 5;
//		if ((num1 / num2 == 5) && (num1 + num2) > 5) {
//			System.out.println("1");
//		} else if ((num1 - num2) >= 1 || (num1 % num2) == 0) {
//			System.out.println("2");
//		} else {
//			System.out.println("3");
//		}
		
//		int a = -10;
//		int b = -200;
//		int c = 2000;
//		int d = 4000;
//		if (a * b >= d) {
//			if (d > c) {
//				if (d % c != 0) {
//					System.out.println(11);
//				} else {
//					System.out.println(22);
//				}
//			}
//		} else {
//			if (b / a > 0) {
//				if (a < b || d % c != 0) {
//					System.out.println(33);
//				} else {
//					System.out.println(44);
//				}
//			}
//		}
//	}
		int num1 = 100;
		int num2 = 200;
		int num3 = 6;
		if (5 >= num3) {
			if (num1 > 100 || num2 > 150) {
				System.out.println("1");
			}
		} else if (num1 >= 100 && num2 > 150) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
		
		int a = -10;
		int b = -200;
		int c = 2000;
		int d = 4000;
		if (a * b >= d) {
			if (d > c) {
				if (d % c != 0) {
					System.out.println(11);
				} else {
					System.out.println(22);
				}
			}
		} else {
			if (b / a > 0) {
				if (a < b || d % c != 0) {
					System.out.println(33);
				} else {
					System.out.println(44);
				}
			}
		}
		
		//
		
//		int i = -1, j = -1;
//		switch (i) {
//		case -1:
//			j = 1;
//		case 2:
//			j = 2;
//			break;
//		default:
//			j = 0;
//		}
//		System.out.println("j = " + j);

		//
		
//		float f = 12;
//		switch (f) { // Line 1
//		case 10 + 1: // Line 2
//			System.out.println("Twelve");
//		case 0: // Line 3
//			System.out.println("Zero");
//		case (int) 12.0:
//			System.out.println("Decimal");
//		default:
//			System.out.println("Default");
//		}
		
		double i;
		char j = 'b';

		switch (j) {
		case 'a':
		case 'A':
			i = 7.5;
			break;
		case 'b':
		case 'B':
			i = 5.5;
			break;

		case 'c':
		case 'C':
			i = 2.5;
			break;

		default:
			i = 0.5;
		}
		System.out.println(i);
		
		//
		
//		int k = 1;
//		switch (k) {
//		default:
//			System.out.println("Hello");
//		case 1:
//			System.out.println("Welcome");
//		case 2:
//			System.out.println("To");
//		case 3:
//			System.out.println("Infosys");
//			break;
//		}
		
//		int k = 2;
//		switch (k) {
//		case 'a':
//			System.out.println("Welcome");
//		case 2:
//			System.out.println("To");
//		case 'b':
//			System.out.println("Infosys");
//			break;
//		default:
//			System.out.println("Hello");
//		}
		
		int k = 1;
		switch (k) {
		default:
			System.out.println("Have");
		case 'a':
			System.out.println("A");
		case 'b':
			System.out.println("Good Day");
		}
	}
}
