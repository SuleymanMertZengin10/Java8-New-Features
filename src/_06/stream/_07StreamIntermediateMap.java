package _06.stream;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class _07StreamIntermediateMap {
	public static void main(String[] args) {
		long count = Stream.of(1, 2, 3, 4, 5)
				.map(i -> i * i)  //  R apply(T t); Integer alıp Integer donmus bu durumda
				.peek(i -> System.out.printf("%d ", i))
				.count();
        System.out.printf("%nThe stream has %d elements", count);
        
        System.out.println();
        System.out.println("-----");
        
        DoubleStream.of(1.0, 4.0, 9.0)
        .map(Math::sqrt)
        .peek(System.out::println)
        .sum();
		

        
        
	}
	

}
