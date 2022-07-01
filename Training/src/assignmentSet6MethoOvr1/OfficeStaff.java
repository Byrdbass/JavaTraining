package assignmentSet6MethoOvr1;

public class OfficeStaff extends Faculty {
	private String designation;

	public OfficeStaff(String name, float basicSalary, String designation) {
		super(name, basicSalary);
		this.designation = designation;
	}
	
	public double calculateSalary() {
		float designationPay = 0f;
		if (this.designation.equals("Accountant")) {
			designationPay = 10000f;
		}
		else if (this.designation.equals("Clerk")) {
			designationPay = 7000f;
		}
		else if (this.designation.equals("Peon")) {
			designationPay = 4500f;
		}
		double salary = super.calculateSalary()+designationPay;
		return salary;
	}
//		super.calculateSalary();
//		double additionalPay = 0;
//		switch(designation) {
//		case "Accountant":
//			additionalPay = 1000.0;
//			break;
//		case "Clerk":
//			additionalPay = 1000.0;
//			break;
//		case "Peon":
//			additionalPay = 1000.0;
//			break;
//		default:
//			System.out.println("invalid designation");
//			
//		}
//		return additionalPay + salary;
//	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
