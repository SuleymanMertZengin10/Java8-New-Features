package _07.stream.terminal;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _08Collect {
     
	public static void main(String[] args) {
		
	//Stream deki elamnları Listeye dönüştürüyoruz
	
		Stream<String>test=Stream.of("ali","veli","hasan","mahmut");
		List<String>list=test.filter(s->s.length()>3).collect(Collectors.toList());		
		//ArrayList
		//List<String>list2=test.filter(s->s.length()>3).collect(Collectors.toSet());
		//HashSet
		list.forEach(System.out::println);
		Stream<String>test2=Stream.of("ali","veli","hasan","mahmut");
		test2.collect(Collectors.toCollection(TreeSet::new));
		//özel olarak belirtebiliriz 
		
		
		
		
		
		
	  
   } 
}
