package day9_abstractExer1;

public abstract class Student {
	private String studentName;
	private int[] testScores;
	private String testResult;
	
//	@Override
//	public String toString() {
//		return "Student [studentName=" + studentName + "]";
//	}
	public Student(String studentName) {
		this.studentName = studentName;
		this.testScores = new int[4];
	}

	public abstract void generateResult();
	
	public void setTestScores(int testNumber, int testScore) {
		//set the value of the testScore in the appropriate position of testScores array based on the testNumber
		testScores[testNumber] = testScore;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int[] getTestScores() {
		return testScores;
	}



	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}
	
	
}
