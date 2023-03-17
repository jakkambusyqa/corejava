package Strings;

public class Reverse {

	public static void main(String[] args) {

		String s="india";
		
		String rev="";
				
        int len=s.length();	//5
		
		for (int i = len-1; i>=0; i--) {
			
			rev=rev+s.charAt(i);
			
			
		
		
		}
	
	System.out.println(rev);
	}
	
	

}
