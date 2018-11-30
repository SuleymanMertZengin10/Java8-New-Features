package _06.stream;

import java.util.Random;
import java.util.regex.Pattern;

public class _03StreamSources {
	public static void main(String[] args) {
		new Random().ints().limit(21).forEach(System.out::println); 
		System.out.println("------");
		"hello".chars().forEach(ch -> System.out.printf("%c ", ch));
		System.out.println();
		
		Pattern.compile(" ").splitAsStream("java 8 streams").forEach(System.out::println);
	}

}
