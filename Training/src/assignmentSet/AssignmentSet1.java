package assignmentSet;

public class AssignmentSet1 {
	public static void main(String[] args) {
		// Implement your code here 
		
		String Door = "D089";
		String Street = "St. Louis Street";
		String City = "Springfield";
		int Zip = 62729;
		
		System.out.println("Door No: " + Door);
		System.out.println("Street: " + Street);
		System.out.println("City: " + City);
		System.out.println("ZIP Code: " + Zip);
		
		//
		
		float pi = 3.14f;
		int radius = 4;
		float Area = pi*radius*radius;
		System.out.println(Area);
		
		//
		
		float far = 50f;
		float C = ((far-32)/9)*5;
		System.out.println(C);
		
		
		//
		
//		int a = 6;
//		int b = 5;
//		int answer = 0;
//		if (a==b) {
//			answer=a+b;
//		}
//		else {
//			answer=(a+b)*2;
//		}
//		System.out.println(answer);
		
		//
		
		int a =1;
		int b=4;
		int c=6;
		float discrim = (b*b) - (4*a*c);
		float root = (-b + discrim)/2*a;
		//System.out.println(root);
		
		if (discrim == 0) {
			System.out.println("The root is " + root);
		}
		else if (discrim > 0) {
			float root1 = (-b + discrim)/2*a;
			float root2 = (-b - discrim)/2*a;
			System.out.println("The roots are " + root1 + " and "+ root2);
			
		} 
		else {
			System.out.println("The equation has no real roots");
		}
		
		
		//
		
		short d = 2;
		short e = 6;
		short g = 7;
		int result = 1;
		
		if (d == 7) {
			result = e*g;
		}
		else if (e == 7) {
			result = g;
		}
		else if (g ==7) {
			result = -1;
		}
		else {
			result = d*e*g;
		}
		System.out.println(result);
		
		//
		
		// <= 3 = $0
		// <=6 = $1
		// >6 = $2 for each km over
		// veg = $12 per plate
		// nonVeg = $15 per plate
		
		char foodType = 'V';
		int quant = 1;
		int distance = 7;
		int total = 0;
		
		switch(foodType) {
		case 'N':
			if (distance > 6) {
				total = (quant*15) + 1 + 2*(distance-5);
			}
			else if(distance <= 6 && distance > 3) {
				total = (quant*15) + 1;
			}
			else if (distance == 0) {
				total = -1;
			}
			else {
				total = (quant*15);
			}
			break;
		case 'V':
			if (distance > 6) {
				total = (quant*12) + 1 + 2*(distance-5);
			}
			else if(distance <= 6 && distance > 3) {
				total = (quant*12) + 1;
			}
			else if (distance == 0) {
				total = -1;
			}
			else {
				total = (quant*12);
			}
			break;
		}
		System.out.println(total);
		
		//
		
		int account = 1001;
		double salary = 40000;
		double balance = 250000;
		String loanType = "Car";
		double expectedLoan = 300000;
		int expectedEmis = 30;
		
		if (account >= 1999 && account <= 1000) {
			if (balance < 1000) {
				System.out.println("insufficient balance in the account");
			}
			else {
				if(salary >2500 && salary <= 50000) {
					System.out.println("eligibleLoanAmount=500000");
					System.out.println("eligibleEmis=36");
					
				}
				else if(salary > 50000 && salary<=75000) {
					System.out.println("eligibleLoanAmount=500000");
					System.out.println("eligibleEmis=36");
				}
				else {
					
				}
			}
		} 
		else {
			System.out.println("Invalid account number");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
