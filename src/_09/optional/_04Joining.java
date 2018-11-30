package _09.optional;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _04Joining {
	public static void main(String[] args) {
		 Stream<String>s1=Stream.of("s1","s2","s3");
		 Stream<String>s2=Stream.of("s4","s3","s4");
		 
		 String joined=s1.collect(Collectors.joining());
		 System.out.println(joined);
		 
		 String joined2=s2.collect(Collectors.joining(","));
		 System.out.println(joined2);
		 
		 
	}
	
}
