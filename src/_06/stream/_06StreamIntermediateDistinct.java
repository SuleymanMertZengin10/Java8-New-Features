package _06.stream;

import java.util.stream.Stream;

public class _06StreamIntermediateDistinct {
	public static void main(String[] args) {
		
	Stream.of("s1","s1","s2","s2","s3","s3","s2","s4","s5").distinct().forEach(System.out::println);
   
	//duplicate-->equals == true olması durumu
	
	
		
	}

}
