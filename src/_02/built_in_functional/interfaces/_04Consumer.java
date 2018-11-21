package _02.built_in_functional.interfaces;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class _04Consumer {
	 public static void main(String[] args) {
	Stream<String>deneme=Stream.of("Deneme1","Deneme2","Deneme3","Deneme4");
	
	// Consumer<String>write=str->System.out.println(str);
	
	//method referance 
	Consumer<String>write=System.out::println;
	//printlen zaten direk String alıp void dönüyot
	
	 
	 deneme.forEach(write);
	 
	 
	
		
	}
}
