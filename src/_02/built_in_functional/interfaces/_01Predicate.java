package _02.built_in_functional.interfaces;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class _01Predicate {
	public static void main(String[] args) {
     Stream.of("Suleyman","Semih","Eren","Mert","Melih").filter(str->str.startsWith("S")).forEach(System.out::println);;
     Predicate<String>startM=(String str)->str.startsWith("M");
    Stream.of("Suleyman","Semih","Eren","Mert","Melih").filter(startM).forEach(System.out::println);
	    
	   
	  //negate() metodu tersini almayı sağlar
    
	
	}

}
