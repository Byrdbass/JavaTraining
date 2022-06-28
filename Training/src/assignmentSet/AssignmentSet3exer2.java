package assignmentSet;

public class AssignmentSet3exer2 {
    public static double[] findDetails(double[] salary) {
        //Implement your code here and change the return value accordingly
    	double sum = 0;
    	double average = 0;
    	double[] details = new double[3];
    	double countGreater = 0.0;
    	double countLesser = 0.0;
    	for(int i=0; i<salary.length; i++) {
    		sum += salary[i];
    		average = sum/salary.length;
    		details[0] = average;
    	}
    	for(int i=0; i<salary.length; i++) {
    		if(salary[i] > average) {
    			countGreater++;
    			//System.out.println(countGreater);
    		} 
    		else {
    			countLesser++;
    		}
    	}
    		
    		
    	//System.out.println(sum);
    	details[1] = countGreater;
		details[2] = countLesser;
    	
        return details;     

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
		

	}

}
