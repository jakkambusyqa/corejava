package casualCodes;

public class Occurenacechar {

	public static void main(String[] args) {

		String s="Vikatakavi";
		
		int len=s.length();
		
		int totallen=len;
		
        int withouta=s.replace("a", "").length();		
				
		int lenwithouta=len-withouta;
		
		System.out.println(totallen);
		
		System.out.println(withouta);
		
		System.out.println("The occurence of character a is "+lenwithouta);
						
	}

}
