package training;

public class P10_BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if either of the bits is 1 then it gives 1, otherwise it gives 0
		short a = 10; //1010 in binary
		short b = 5; // 0101 in binary
		int output = a|b; // will be 1111 = which is 15 in binary
		
		System.out.println(output);
		
		//if both the bits are 1, then it gives 1, else it gives 0;
		int output2 = a&b;  ///will be 0000
		System.out.println(output2);
		
	}

}
