package assignmentSet6MethoOvr1;

public class Faculty {
	private String name;
	private float basicSalary;
	private float bonusPercentage = 4f;
	private float carAllowancePercentage = 2.5f;
	
	public Faculty(String name, float basicSalary) {
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	double calculateSalary() {
		double salary = this.basicSalary*(1+(this.bonusPercentage/100) + (this.carAllowancePercentage/100));
		//double salary = basicSalary + basicSalary*(bonusPercentage/100) + basicSalary*(carAllowancePercentage/100);
		return salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getBonusPercentage() {
		return bonusPercentage;
	}

	public void setBonusPercentage(float bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}

	public float getCarAllowancePercentage() {
		return carAllowancePercentage;
	}

	public void setCarAllowancePercentage(float carAllowancePercentage) {
		this.carAllowancePercentage = carAllowancePercentage;
	}
	
	
	
	
	
	
	
}
