package _02.built_in_functional.interfaces;

import java.util.function.Function;

public class _05Function {

	public static void main(String[] args) {
	Function<String, Integer>length1=str->str.length();
	
	System.out.println(length1.apply("SULEYMAN"));
	
	
	
	 	
  }
}
