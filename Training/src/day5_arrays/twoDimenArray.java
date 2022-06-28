package day5_arrays;

public class twoDimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = new int[2][3];
		//or
		int[][] arr2 = new int[][] {{10,11,34} , {12,14}};
		
		arr1[0][0] = 10;
		arr1[0][1] = 11;
		arr1[1][0] = 12;
		arr1[1][1] = 14;
		arr1[0][2] = 34;
		
				
		//System.out.println(arr1);
		System.out.println(arr1.length); //return number of rows
		System.out.println(arr1[1].length); //return number of columns in the first row

		for(int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println("");
		}
		
	}

}
