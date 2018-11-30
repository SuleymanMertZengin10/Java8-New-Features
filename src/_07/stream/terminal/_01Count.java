package _07.stream.terminal;

import java.util.stream.Stream;

public class _01Count {
	public static void main(String[] args) {
		
	Stream<String>deneme=Stream.of("deneme1","deneme2","deneme3");
	long c=deneme.count();
	System.out.println(c);
   //deneme.forEach(System.out::println);
   //java.lang.IllegalStateException: 
	
   //TERMİNAL bir operation kullandıktan sonra tekrar bir terminal operation
   //kullanırsak bu hatayı alırız
	
	
	
	}

}
