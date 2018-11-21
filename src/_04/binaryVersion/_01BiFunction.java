package _04.binaryVersion;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _01BiFunction{

	public static void main(String[] args) {
	
		//birden çok paremetre alan durumlar için düşüneceğiz.
		//Supplier parametre almıyordu bunun için uygulamayız
		BiFunction<String, String, String>concat=(x,y)->x.concat(y);
		//R apply(T t, U u);
		System.out.println(concat.apply("Suley", "man"));
		
		BiFunction<String, String, String>concat2=String::concat;
		System.out.println(concat2.apply("ZEN", "GİN"));
		
		BiFunction<Double, Double, Integer>bif= Double::compareTo;
		
		BiFunction<Double, Double, Integer>bif2= Double::compare;

		
		
	}

}
