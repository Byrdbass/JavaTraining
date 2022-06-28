package assignmentSet;

public class AssignmentSet3exer3 {

   public static int[] findLeapYears(int year){
       //Implement your code here and change the return value accordingly
	   int[] every4 = new int[15];
	   every4[0] = year;
	   for (int i=1; i<every4.length; i++) {
		   every4[i] = year +=4;
	   }
       return every4;
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int year = 2000;
		   int[] leapYears;
		   leapYears=findLeapYears(year);
		   for ( int index = 0; index<leapYears.length; index++ ) {
		       System.out.println(leapYears[index]);
		   }

	}

}
