package day5_arrays;

public class sumAndAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,-9,0,5,12};
		double sum = 0;
		double average = 0;
		for(int i = 0; i<arr.length; i++) {
			
			sum += arr[i];
			average = sum/arr.length;
			
		}
		System.out.println(sum);
		System.out.println(average);
		
	}

	

}
