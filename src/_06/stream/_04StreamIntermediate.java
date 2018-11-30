package _06.stream;

import java.util.stream.Stream;

public class _04StreamIntermediate {

	public static void main(String[] args) {
		//geriye Stream dönen metotlar Intermediate metotlardır
		//Stream<T> filter(Predicate<?super T> check)
		//Stream<T> distinct()
		//Stream<T> limit(long size)
		//...
		
		Stream.of(1,2,3,4,5).peek(i->System.out.println(i+""));
		//terminal operation olmadıgı için birşey yazmaz ekrana
		
		long l1=Stream.of(1,2,3,4,5).peek(i->System.out.println(i+"")).count();
		//terminal operation oldugu için çalısır 
		//bir kez kullandıgımızda başka terminal operation kullanamayız
		//IllegalStateException hatası alırız 
		
		
		
	}
}
