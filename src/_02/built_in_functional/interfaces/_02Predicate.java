package _02.built_in_functional.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class _02Predicate {

	public static void main(String[] args) {
		
		Predicate<String>nullCheck=arg->arg!=null;
		Predicate<String>emptyCheck=str->str.length()>0;
		Predicate<String>merge=nullCheck.and(emptyCheck);
		
		String message="helloWorld";
		
		System.out.println(merge.test(message));
		System.out.println(merge.test(null));
		System.out.println("---------------");
		
		List<String>list=new LinkedList<>();
		list.add("Suleyman");
		list.add("Zengin");
		list.add("Mert");
		
		list.forEach(System.out::println);
		list.removeIf(str->str.startsWith("S"));
		System.out.println("--------after removing-----");
		list.forEach(System.out::println);
		
		
	}
}
