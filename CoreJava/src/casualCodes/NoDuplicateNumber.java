package casualCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class NoDuplicateNumber {

	public static void main(String[] args) {

		//10,20,50,30,20,10 >> List 
		
		List<Integer> numbers=Arrays.asList(10,20,50,30,20,10);
		
		//System.out.println(numbers);
		
		List<Integer>distinctnumbers=numbers.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctnumbers);
		
	}

}
