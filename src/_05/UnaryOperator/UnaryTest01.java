 package _05.UnaryOperator;

import java.util.Arrays;
import java.util.List;

public class UnaryTest01 {
       public static void main(String[] args) {
	
    	   List<Integer> ell = Arrays.asList(-11, 22, 33, -44, 55);
    	   System.out.println("Before: " + ell);
    	   ell.replaceAll(Math::abs);
    	   System.out.println("After: " + ell);
  }
}
