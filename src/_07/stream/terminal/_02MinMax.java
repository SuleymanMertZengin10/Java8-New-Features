package _07.stream.terminal;

import java.util.Optional;
import java.util.stream.Stream;

public class _02MinMax {
	public static void main(String[] args) {
		//Optional<T> min(Comparator<? super T> comparator);
		//Optional<T> max(Comparator<? super T> comparator);
	
    Stream<String>animals=Stream.of("Dog","Monkey","Elephant");
    Optional<String>optionalAnimals= animals.min((s1,s2)->s1.length()-s2.length());
    System.out.println(optionalAnimals.get());
	
	}
}
