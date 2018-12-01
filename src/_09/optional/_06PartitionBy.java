package _09.optional;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _06PartitionBy {
	public static void main(String[] args) {
		Stream<String>names=Stream.of("Ali","can","Suleyman","zengin","VELİ","Hasan","Hasan");
		//
		Predicate<String>p1=s1->s1.length()<5;
		Map<Boolean,List<String>> maps=names.collect(Collectors.partitioningBy(p1));
		System.out.println(maps);
		//sartı sağlayanlar true listesinde sağlamayanlar false listesinde
		
	}

}
