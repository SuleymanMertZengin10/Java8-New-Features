package _07.stream.terminal;

import java.util.Optional;
import java.util.stream.Stream;

public class _04Find {
	public static void main(String[] args) {
		Stream<String>citys=Stream.of("Trabzon","İzmir","Adana");
		Optional<String>firstCity=citys.findFirst();
	    System.out.println(firstCity.get());
	    
	    
	}
	

}
