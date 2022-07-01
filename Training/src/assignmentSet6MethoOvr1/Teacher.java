package assignmentSet6MethoOvr1;

public class Teacher extends Faculty {
	private String qualification;
	
	public Teacher(String name, float basicSalary, String qualification) {
		super(name, basicSalary);
		this.qualification = qualification;
	}

	public double calculateSalary() {
		double qualificationPay = 0f;
		if (this.qualification.equals("Doctoral")) {
			qualificationPay = 20000f;
		}
		else if (this.qualification.equals("Masters")) {
			qualificationPay = 18000f;
		}
		else if (this.qualification.equals("Bachelors")) {
			qualificationPay = 15500f;
		}
		else if (this.qualification.equals("Associate")) {
			qualificationPay = 10000f;
		}
		double salary = super.calculateSalary()+qualificationPay;
		return salary;
//		super.calculateSalary();
//		double additionalPay = 0f;
//		switch(qualification) {
//		case "Doctoral":
//			additionalPay = 20000.0;
//			break;
//		case "Masters":
//			additionalPay = 18000.0;
//			break;
//		case "Bachelors":
//			additionalPay = 15500.0;
//			break;
//		case "Associate":
//			additionalPay = 10000.0;
//			break;
//		default:
//			System.out.println("invalid designation");
//			
//		}
//		return additionalPay + salary;
	}

	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
}
