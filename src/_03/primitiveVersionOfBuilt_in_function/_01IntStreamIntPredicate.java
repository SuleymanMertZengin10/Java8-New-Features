package _03.primitiveVersionOfBuilt_in_function;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class _01IntStreamIntPredicate {
	
	public static void main(String[] args) {
	IntPredicate ip=i->i%2==0;	
		
	  IntStream.rangeClosed(0, 12).filter(i->i%2==0).forEach(System.out::println);
	  IntStream.rangeClosed(0, 123).filter(ip).forEach(System.out::println);
		
	}

	
}
