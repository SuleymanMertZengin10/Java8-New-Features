package _06.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _01StreamSources {
	
	 public static void main(String[] args) {
		 //range()
         IntStream.range(1, 100);
	
		 
		 //iterate() 
		 IntStream.iterate(1,i->i+1).limit(4).forEach(System.out::println);
		 Stream.empty();
		 
		 //of()
	     Stream.of(1,2,3,4,5);
	    
	     List<String>names=Arrays.asList("suleyman","zengin");
	     Stream<String>streamNames=names.stream();
	    
	     //generate()
	     Stream<Double>stream=Stream.generate(Math::random);


	     //add()
	     System.out.println("----------");
	     Stream.builder().add(1).add(2).add(3).build().forEach(System.out::println);
	     
	     Stream.iterate(1,i->i+1).limit(100).forEach(System.out::println);
	     
	     
	     
		 
	}

}
