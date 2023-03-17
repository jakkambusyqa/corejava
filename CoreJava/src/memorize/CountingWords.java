package memorize;

import java.util.Scanner;

public class CountingWords {

	public static void main(String[] args) {

		
		System.out.println("Enter the sentence");
		
		Scanner sc =new Scanner(System.in);
		
		String s=sc.nextLine();
		
		
		
		//String s="Welcome to coding";
		
		//s.charAt(i)=' '    s.charAt(i+1)!=' '
		
		
		int count=1;
		
		for (int i = 0; i < s.length()-1; i++) {
			
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
				
				count++;
				
			}
			
		}
		
		System.out.println("the count of words is "+count);
	}

}
