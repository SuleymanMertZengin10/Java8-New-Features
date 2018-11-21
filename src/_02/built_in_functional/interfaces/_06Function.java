package _02.built_in_functional.interfaces;

import java.util.function.Function;

public class _06Function {
public static void main(String[] args) {
	//alttaki gramer ile aynı
	Function<String, Integer>f1=Integer::parseInt;
	// public static int parseInt(String s)
	
	Function<String, Integer>f2=(String str)->{
		return Integer.parseInt(str);
	};
	
	System.out.println(f1.apply("12"));
	System.out.println(f2.apply("12"));
 
    Function<Integer,Integer>math=Math::abs;
    Integer i=math.apply(-12);
    System.out.println(i);
  }
}
