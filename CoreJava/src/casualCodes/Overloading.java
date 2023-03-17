package casualCodes;

public class Overloading {
	
	
	
	public void add(long a,double b){
		System.out.println(a+b);
		
	}
	
	public void add(int b,int a){
		System.out.println(a+b);
		
	}
	
		
	
	public static void main(String[] args) {

		Overloading o=new Overloading();
		o.add(10,20);
		
		
		
	}

}
