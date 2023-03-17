package memorize;

public class Reverse3 {

	public static void main(String[] args) {

		String S="ferrari";
		
		String Rev="";
		int len=S.length();
		
		for (int i=len-1; i>=0; i--) {
			
			Rev=Rev+S.charAt(i);
			
			
		}
		
		System.out.println(Rev);
	}

}
