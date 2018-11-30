package _04.binaryVersion;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class _02BiPredicate {

	  public static void main(String[] args) {
		BiPredicate<List<Integer>, Integer>listContains=List::contains;
		List aList=Arrays.asList(12,13,14);
		System.out.println(listContains.test(aList, 14));
         
	}

}
