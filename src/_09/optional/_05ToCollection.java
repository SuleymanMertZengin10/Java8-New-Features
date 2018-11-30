package _09.optional;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _05ToCollection {
	public static void main(String[] args) {
		Stream<String>s1=Stream.of("lions","tigers","bears","lions","");
		TreeSet<String>result=s1.filter(s->s.startsWith("l")).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result); 	
 	}
 
}
