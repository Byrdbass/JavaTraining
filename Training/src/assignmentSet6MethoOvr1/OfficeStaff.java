package assignmentSet6MethoOvr1;

public class OfficeStaff extends Faculty {
	private String designation;

	public OfficeStaff(String name, float basicSalary, String designation) {
		super(name, basicSalary);
		this.designation = designation;
	}
	
	public double calculateSalary(double salary) {
		super.calculateSalary();
		double additionalPay = 0;
		switch(designation) {
		case "Accountant":
			additionalPay = 1000.0;
			break;
		case "Clerk":
			additionalPay = 1000.0;
			break;
		case "Peon":
			additionalPay = 1000.0;
			break;
		default:
				System.out.println("invalid designation");
			
		}
		return additionalPay + salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	

}
