package day6_Strings;

public class StringAssign3 {

    public static String reverseEachWord(String str){
    	String backwards = "";
    	for(int i=str.length()-1; i>=0; i--) {
    		backwards = backwards + str.charAt(i);
    	}
    
        return backwards;
	}
	
	public static void main(String args[]){
	    String str = "all cows eat grass";
	    System.out.println(reverseEachWord(str));
	}
}
