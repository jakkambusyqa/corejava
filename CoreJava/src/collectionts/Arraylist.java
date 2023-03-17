package collectionts;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {

	ArrayList<String> al=new ArrayList<String>();
	
	al.add("john");
	al.add("rock");
	al.add("vams");
	al.add("rams");
	al.add("sam");
	
	System.out.println("the list contains "+al);
	
	
	ArrayList<String> al2=new ArrayList<String>();
	
	
	al2.add("miller");
	al2.addAll(al);
	Collections.sort(al2);
	
	System.out.println("After adding previous list"+al2);
	
		
	
	
	}
	

}
