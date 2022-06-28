package day5_encap;

public class Employee {
	private int empno;
	private String ename;
	private double sal;
	
	
	
	public Employee(int empno, String ename, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	

	void display() {
		System.out.println("Employee number: " + this.empno );
		System.out.println("Employee name: " + this.ename);
		System.out.println("Salary: " + this.sal );
		
	}
}
