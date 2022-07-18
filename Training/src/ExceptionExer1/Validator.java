package ExceptionExer1;

public class Validator{
	
	
	public boolean validateName(String name) {
		if (name == null)
			return false;
		int countOfSpaces = 0;
		for (int i= 0; i< name.length(); i++) {
			if(name.charAt(i) == ' ') {
				countOfSpaces++;
			}
		}
		if(countOfSpaces == name.length())
			return false;
		return true;
		
		
	}
	public boolean validateJobProfile(String jobProfile) {
		if(!(jobProfile.equalsIgnoreCase("Officer")||
				jobProfile.equalsIgnoreCase("Executive")||
				jobProfile.equalsIgnoreCase("Associate")||
				jobProfile.equalsIgnoreCase("Clerk")))
			return false;
		return true;
	}
	public boolean validateAge(int age) {
		if(age<18||age>30)
			return false;
		return true;
	}
	
	public void validate(Applicant applicant) throws InvalidNameException, InvalidJobProfileException, InvalidAgeException { 
		if(!(validateName(applicant.getName()))) {
			throw new InvalidNameException("Invalid Name");
		}
		if(!(validateName(applicant.getName()))) {
			throw new InvalidJobProfileException("Invalid Job Profile");
		}
		if(!(validateName(applicant.getName()))) {
			throw new InvalidAgeException("Invalid Age");
		}
	}
}
