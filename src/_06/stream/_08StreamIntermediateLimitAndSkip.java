package _06.stream;

import java.util.stream.Stream;

public class _08StreamIntermediateLimitAndSkip {
	public static void main(String[] args) {
		
		Stream<Integer>s=Stream.iterate(2, i->i+1);
		s.skip(2).limit(5).forEach(System.out::println);
		//2 3 4 5 6 skip metodu yokken 
		
        //skip(2) eklediğimizde il 2 elemanı atlıyor 
	    // 4 5 6 7 8 şeklinde yazıyor  	 
	  	
		
		
		
	}

}
