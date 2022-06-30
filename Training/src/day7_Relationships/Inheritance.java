package day7_Relationships;

public class Inheritance {
	
	public class Employee{
		int empno;
		String ename;
		public Employee() {
			System.out.println("Super class Employee Constructor");
		}
		
		
		
	}
	
	public class ProjectManager extends Employee{
		String projectName;

		public ProjectManager() {
			System.out.println("Project super class");
		}
		
		
	}
	

	public static void main(String[] args) {
		
//		ProjectManager p1 = new ProjectManager();
//		p1.empno=100;
//		p1.ename="Parimala";
//		p1.projectName="ETA";
//		
//		Employee e1 = new Employee();
		

	}

}
