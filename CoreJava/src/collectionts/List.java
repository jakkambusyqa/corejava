package collectionts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class List {

	public static void main(String[] args) {

		java.util.List<Integer> num=Arrays.asList(10,20,50,30,20,10);
		
		System.out.println(num);
		
        Set<Integer> set=new HashSet<Integer>(num);
        
		System.out.println(set);
	}

}
