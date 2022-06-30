package assignmentSet5inher1;

public class PermanentEmployee extends Employee{
	double basicPay;
	double hra;
	float experience;
	public PermanentEmployee(int employeeId, String employeeName, double basicPay, double hra, float experience) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}

	public void calculateMonthySalary() {
		float varComponent;
		if(this.experience >= 10) {
			varComponent = 12f;
		}
		else if (this.experience >= 5 && this.experience<10) {
			varComponent = 7f;
		} 
		else if (this.experience >=3 && this.experience<5) {
			varComponent = 5f;
		}
		else {
			varComponent = 0f;
		}
		double salary = (float)((this.basicPay*(varComponent/100)) + this.hra + this.basicPay);
		this.setSalary(salary);
		
	}
	
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	
}
