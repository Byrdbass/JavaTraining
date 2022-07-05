package day9_objectClasses;

public class Student {
	private String name;
	private int age;
	private int studentId;
	
	public Student(String name, int age, int studentId) {
		super();
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		
		if (studentId != s.studentId)
			return false;
		if (!s.getName().equals(this.getName()))  //this is the calling object
			return false;
		if (this.getAge() != s.getAge())
			return false;
		
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	

}
