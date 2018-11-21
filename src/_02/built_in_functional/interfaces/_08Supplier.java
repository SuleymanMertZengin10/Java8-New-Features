package _02.built_in_functional.interfaces;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class _08Supplier {
	public static void main(String[] args) {
		Supplier<String>str = String::new;
		Supplier<String>str2 =()->new String("dasd");
		
		Function<String, Integer>func=Integer::new;
		// public Integer(String s) throws NumberFormatException 
		
		

		
	}

}
