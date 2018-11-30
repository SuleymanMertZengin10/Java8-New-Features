package _07.stream.terminal;

import java.util.stream.Stream;

public class _06Foreach {

	public static void main(String[] args) {
		Stream<String>tests=Stream.of("test1","test2","test3");
		tests.forEach(System.out::println);
		
		
	}
}
