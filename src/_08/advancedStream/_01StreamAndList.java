package _08.advancedStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _01StreamAndList {
	public static void main(String[] args) {
		List<String>deneme=new ArrayList<>();
		deneme.add("Suleyman");
		deneme.add("zengin");
		
		Stream<String>streamDeneme=deneme.stream();
		deneme.add("Mert");
		System.out.println(streamDeneme.count());
		
	
	}

}
