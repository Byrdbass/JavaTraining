package day5_Strings;

public class StringExer1 {

    public static String removeWhiteSpaces(String str){
		//Implement your code here and change the return value accordingly
    	String st = str.replaceAll("\\s+","");
        return st;
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
}
