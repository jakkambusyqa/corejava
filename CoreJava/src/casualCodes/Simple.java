package casualCodes;

public class Simple {

	public static void main(String[] args) {

		String a="sairam";
		String rev="";
		int len=a.length();
		
		
		for (int i=len-1;i>=0; i--) {
			
			rev=rev+a.charAt(i);
									
		}
		System.out.println(rev);	
	}	
		
	}
