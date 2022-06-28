package assignmentSet;

class Teacher{
	String teacherName, subject;
	double salary;
	public Teacher(String teacherName, String subject, double salary) {
		super();
		this.teacherName = teacherName;
		this.subject = subject;
		this.salary = salary;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}

public class AssignmentSet3exer1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1 = new Teacher("Alex", "Java Fundamentals", 1200L);
		Teacher t2 = new Teacher("John", "RDBMS", 800L);
		Teacher t3 = new Teacher("Sam", "Networking", 900L);
		Teacher t4 = new Teacher("Maria", "Python", 900L);
		System.out.println("Name : " + t1.teacherName + ", " +"Subject : "  + t1.subject + ", " + "Salary : " + t1.salary);
		System.out.println("Name : " + t2.teacherName + ", " +"Subject : "  + t2.subject + ", " + "Salary : " + t2.salary);
		System.out.println("Name : " + t3.teacherName + ", " +"Subject : "  + t3.subject + ", " + "Salary : " + t3.salary);
		System.out.println("Name : " + t4.teacherName + ", " +"Subject : "  + t4.subject + ", " + "Salary : " + t4.salary);
		

	}

}
