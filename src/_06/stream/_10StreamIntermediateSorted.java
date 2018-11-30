package _06.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class _10StreamIntermediateSorted {
	public static void main(String[] args) {

	 //Stream<T> sorted(Comparator<? super T> comparator);
	 // Stream<T> sorted();
	 Stream.of(5,4,3,2,1).sorted().forEach(System.out::println);
	 //sıralı sekildi yazar 
 	
    Stream.of("v","DA","a").sorted(Comparator.reverseOrder()).forEach(System.out::println);
	 
	
	
		
   
		
		
	
	}

}
