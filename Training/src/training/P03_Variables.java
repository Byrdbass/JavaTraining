package training;

public class P03_Variables {
	public static void main(String[] args) {
	//INDENTIFIERS OR VARIABLE NAMES CANNOT START WITH A DIGIT, CANNOT HAVE SPACES, CANNOT PUT A HYPEN
	
	int x = 5; //int is the datatype, x is the variable, 5 is the data
	//32 bits of memory
	short ten = 11; //used for small values
	// 16 bits
	long mobile = 123212312l; //needs l at the end UPPER OR LOWERCASE
	//64 bits of memory
	long aWaste = 3L; // allocates too much memory
	//64 bits
	char y = 'M'; //Must have SINGLE QUOTES
	//16 bits
	double a = 34567.58; // a decimal that is large
	//64 bits
	float b = 0.10f; //must have 'F' at the end UPPER OR LOWERCASE
	//32 bits
	byte c = 10; // very small numbers
	// 8 bits
	boolean what = true; // 1 bit
	
	//WHAT ABOUT STRINGS??
	
	System.out.println(x);
	System.out.println(ten);
	System.out.println(mobile);
	System.out.println(aWaste);
	System.out.println(y);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(what);
	}
}
