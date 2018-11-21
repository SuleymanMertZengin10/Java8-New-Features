package _02.built_in_functional.interfaces;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class _07Supplier {
	public static void main(String[] args) {
		Random random=new Random();
		Supplier<Integer>supplier=random::nextInt;
		//public int nextInt() parametre almadan int değer döner
	    //metot static olmadıgı için referance üzerinden erişim sağladık
		
		Stream.generate(supplier).limit(5).forEach(System.out::println);
		
	}

}
