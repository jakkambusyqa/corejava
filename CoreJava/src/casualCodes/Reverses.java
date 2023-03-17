package casualCodes;

public class Reverses {

	public static void main(String[] args) {

	String s="lamborigini";
	int len=s.length();
	String rev="";
	
	for (int i=len-1;i>0 ; i--) {
		
		rev=s.charAt(i)+rev;
		
		
	}
		
		System.out.println(rev);
		
	}
	
}
