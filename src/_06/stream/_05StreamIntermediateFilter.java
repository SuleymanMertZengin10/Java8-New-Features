package _06.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05StreamIntermediateFilter {
	
    public static void main(String[] args) {
    	
       //  Stream<T> filter(Predicate<? super T> predicate);
       // boolean test(T t);
      
       //datayı filtrelememizi sağlıyor 
    	
    	Stream<String>streamData=Stream.of("Suleyman","Ali","Mert","Semih","Hasan","Hamit");
    	streamData.filter(s->s.startsWith("H")).forEach(System.out::println);
    	
    	
    	System.out.println("---------");
    	  
    	IntStream.rangeClosed(0, 10)
    	.filter(i -> (i % 2) == 0)
    	.forEach(System.out::println);
    	
    	System.out.println("---------");
    	
    	IntStream.rangeClosed(0, 10)
    	.map(i -> i * i)
    	.filter(i -> (i % 2) == 0)
    	.forEach(System.out::println);
      
     }

}
