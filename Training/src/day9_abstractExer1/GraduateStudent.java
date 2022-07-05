package day9_abstractExer1;

public class GraduateStudent extends Student{
	
	public GraduateStudent(String studentName) {
		super(studentName);
	}
	
	public void generateResult() {
		int sum = 0;
		for (int score : this.getTestScores()) {
			sum += score;
		}
		float average = sum/this.getTestScores().length;
		if (average >= 70) {
			this.setTestResult("Pass");
		}
		else {
			this.setTestResult("Fail");
		}
	}

	public void setTestScore(int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
