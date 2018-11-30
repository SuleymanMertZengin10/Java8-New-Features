package _06.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _09StreamFlatMap {
	public static void main(String[] args) {
		List<String>zero=Arrays.asList();
		List<String>one=Arrays.asList("Suleyman");
		List<String>two=Arrays.asList("Mert","Zengin");
		Stream<List<String>>names=Stream.of(zero,one,two);
		names.flatMap((List<String>l)->l.stream()).forEach(System.out::println);
		
		
	}

}
