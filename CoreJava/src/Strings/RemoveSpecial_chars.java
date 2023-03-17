package Strings;

public class RemoveSpecial_chars {

	public static void main(String[] args) {

		String s="&**&&$#@vandebharat1256984";
		
		String str=s.replaceAll("[^a-zA-z0-9]", "");
		
		System.out.println(str);
	}

}
