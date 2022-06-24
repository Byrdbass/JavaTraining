package training;

public class P19_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//USE THIS INSTEAD OF WHILE if you know the exact number of iterations
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		
		
		//prints odd numbers
		for(int j=0;j<=10;j++) {
			
			//skips the even
			if(j%2==0) {
				//this will skip the remaining lines iteration and takes the control to the next iteration
				continue;
			}
			
			System.out.println(j);
		}
		
		for(int k=0;k<=10;k++) {
			
			//will terminate the loop
			if(k==8) {

				break;
			}
			
			System.out.println(k);
		}
	}

}
