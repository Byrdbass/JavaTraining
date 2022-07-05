package day9_abstractExer1;

public class UndergraduateStudent extends Student{

	public UndergraduateStudent(String studentName) {
		super(studentName);
	}
	
	public void generateResult() {
		int sum = 0;
		for (int score : this.getTestScores()) {
			sum += score;
		}
		float average = sum/this.getTestScores().length;
		if(average >= 60) {
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
