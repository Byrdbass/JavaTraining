package day5_Strings;

public class StringQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "How Are You?";
		System.out.println(str.length());
		System.out.println(str.charAt(11));
		//System.out.println(str.charAt(str.length())); //index out of bounds cause index starts at 0
		
		String num = "10";
		int n = 20;
		System.out.println(num + n); //will concat
		
//		String s1 = "abc";
//		String s2 = "abcd";
//		System.out.println(s1 = s2);
		
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1.equals(s2));  //boolean method
		System.out.println(s1 == s2);  //IS THE DOUBLE EQUALS NOT ALLOWED FOR COMPARING STRINGS?

		String passengerFirstName = "James";
		String p1 = passengerFirstName.toUpperCase();
		System.out.println(p1.equals(passengerFirstName));
		System.out.println(p1.equalsIgnoreCase(passengerFirstName));
		
		String input = "welcome to string functions";
		input.toUpperCase();
		System.out.println(input);
	}

}
