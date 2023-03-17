package casualCodes;

public class Primenumber {

	public static void main(String[] args) {

		int num=5;
		int count=0;
		
		
		  //checking number is greater than zero coz it should be a natural number
	    
		for (int i = 1; i <=num; i++) {
			
		if (num%i==0)
			count++;
		}
		if(count==2){
			System.out.println("prime");
		}
		else
			System.out.println("not a prime");
			
		}
		
		
		
		
		
		}
		
		
		
	