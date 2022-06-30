package day6_Strings;

public class StringAssign2 {
    public static boolean checkPalindrome(String str){
    	String backwards = "";
    	boolean isPalin = false;
    	
    	//use length
    	int len = str.length()-1;
    	
    	for (int i = len; i>-1; i--) {
    		backwards = backwards + str.charAt(i);
    		System.out.println(backwards);
    	}
    	
    	System.out.println(backwards);
    	//use the equalsTo method
    	isPalin = backwards.equalsIgnoreCase(str);
    	
    	
    	//use the charAt method
    	
    	
        return isPalin;
	}

	public static void main(String[] args) {
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");

	}
}
