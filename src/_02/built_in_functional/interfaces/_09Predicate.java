package _02.built_in_functional.interfaces;

import java.util.function.Predicate;

public class _09Predicate {
	public static void main(String[] args) {
		Predicate<String>p2=x ->x.isEmpty();
		
		Predicate<String>p1=String::isEmpty;
		//public boolean isEmpty()
		//staric metot değildir fakat direk String ile erişebildik 
		//Bunun  nedeni T String tipindedir metot static olmasada bu durumda kullanabiliriz
		
		
		
	}

}
