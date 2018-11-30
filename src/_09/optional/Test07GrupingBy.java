package _09.optional;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test07GrupingBy {
	
	public static void main(String[] args) {
		Stream<String>names=Stream.of("Ali","can","Suleyman","zengin","VELİ","Hasan","Hasan");
		Stream<String>names2=Stream.of("Ali","can","Suleyman","zengin","VELİ","Hasan","Hasan","Hasan","Hasan");

	Map<Integer,List<String>>maps=	names.collect(Collectors.groupingBy(String::length));
	
	System.out.println(maps);
	
	Map<Integer,Set<String>>maps2=	names2.collect(Collectors.groupingBy(String::length,Collectors.toSet()));
	System.out.println(maps2);
	
	}
}
