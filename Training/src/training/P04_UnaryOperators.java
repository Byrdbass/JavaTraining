package training;

public class P04_UnaryOperators {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b;
		int c;
		b = ++a;  //INCREMENT A BY ONE AND THEN THE NEW VALUE WILL BE RETURNED
		//a+1
		c = a++;  // EXISTING value will be returned and THEN the increment will happen
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int d = 70;
		System.out.println(++d); //increment happens first then new value
		//71
		System.out.println(d++); // existing value printed then increment will made
		//71
		System.out.println(d);
		//72
		
		short f = 10; 
		short h = ++f; //increment happens then new value
		// 
		short i = h++; //existing value returned, then increment
		
		//
		System.out.println(f);
		System.out.println(h);
		System.out.println(i);
		
		// ~ -> BITWISE COMPLEMENT - FLIPS BITS OF THE FALUE
		// ! -> INVERTS THE VALUE OF A BOOLEAN
	}

}
