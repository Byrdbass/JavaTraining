package ExceptionExer1;

public class Validator extends Applicant {
	
	public Validator(String name, String jobProfile, int age) {
		super(name, jobProfile, age);
		// TODO Auto-generated constructor stub
	}
	
	boolean validateName(String name) {
		try {
			return true;
		}
		catch(NullPointerException e){
			return false;
		}
		catch (Exception e) {
			return false;
		}
		finally {
			
		}
		
		
	}
	boolean validateJobProfile(String jobProfile) {
		try {
			//do i use a conditional statement here?
			if ( jobProfile.equals("Associate") || jobProfile.equals("Clerk") || jobProfile.equals("Executive") || jobProfile.equals("Officer") )
			return true;
		}
		catch(Exception e){
			
		}
		
		return false;
	}
	boolean validateAge(int age) {
		return false;
	}
	void validate(Applicant applicant) {
		
	}
}
