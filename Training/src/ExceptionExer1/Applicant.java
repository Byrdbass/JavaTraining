package ExceptionExer1;

public class Applicant {
    private String name;
    private String jobProfile;
    private int age;
    
    
	public Applicant(String name, String jobProfile, int age) {
		super();
		this.name = name;
		this.jobProfile = jobProfile;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobProfile() {
		return jobProfile;
	}
	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
