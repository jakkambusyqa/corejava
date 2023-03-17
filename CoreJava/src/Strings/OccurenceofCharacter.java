package Strings;

public class OccurenceofCharacter {

	public static void main(String[] args) {

	String s="this is my range rover";
	
	int totalcount=s.length();
	
	int totalcountwithouta =s.replace("r", "").length();
	
	int count= totalcount-totalcountwithouta;
	
	System.out.println(count);
	
	
		
	}

}
