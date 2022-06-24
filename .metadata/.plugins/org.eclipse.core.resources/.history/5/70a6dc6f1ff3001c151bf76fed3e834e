package PassReferenceValues;

public class Tester {
	public static void main(String args[]) {
		
		//PASS by COPY
		int x=10; //10
		System.out.println(x);
		PassByValue PB = new PassByValue();
		PB.changeValue(x); //40
		System.out.println(x);  //STILL 10!
		
		// PASS BY CLASS
		int y=13;
		System.out.println(y);
		PassByReference PBRef = new PassByReference();
		PBRef.change2(PB);
		System.out.println(PB);
				
	}
}
