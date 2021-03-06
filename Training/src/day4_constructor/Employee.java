package day4_constructor;

public class Employee {
	
	//instance varaibles
	int empNum;
	String empName;
	String job;
	double salary;
	
	//parameterized constructor
//	Employee(int eNum, String emName, String j, double sal){
//		
//	}  THIS WAS CREATED INTENTIONALLY DIFFERENT THAN THE INSTANCE VARIABLES
//	
	
	public Employee()
	{
		System.out.println("parameterless constructor");
	}

	public Employee(int empNum, String empName, String job, double salary) {
		//super();  // 
		this(); //will call the default constructor - the parameterless above
		this.empNum = empNum;
		this.empName = empName;
		this.job = job;
		this.salary = salary;
	}

	void display() {
		System.out.println(empNum);
		System.out.println(empName);
		System.out.println(job);
		System.out.println(salary);
	}
}
