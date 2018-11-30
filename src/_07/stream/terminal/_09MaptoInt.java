package _07.stream.terminal;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _09MaptoInt {
	public static void main(String[] args) {
		Stream<Integer>stream=Stream.of(1,2,3,4,5,6);
		
		IntStream is=stream.mapToInt(t->t);
		//STREAM den IntStream e dönüştürme
		
		
		
	}
	

}
