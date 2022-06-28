package day6_Strings;

public class StringAssign1 {
	
    public static String moveSpecialCharacters(String str){
		//Implement your code here and change the return value accordingly
//    	String specChar = "!@#$%&*()'+,-:;<=>?[]^_`";
//    	if (str.equalsIgnoreCase(str))
    	String nonSpecialChar = "";
    	String specialC = "";
    	for (int i = 0; i<str.length(); i++) {
    		char c = str.charAt(i);
    		if ((c >= 'A' && c<= 'Z') || (c >= 'a' && c <= 'z')) {
    			nonSpecialChar += c;
    		}
    		else {
    			specialC += c;
    		}
    	}
    	
        return (nonSpecialChar + specialC);
	}

	public static void main(String[] args) {
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}

}
