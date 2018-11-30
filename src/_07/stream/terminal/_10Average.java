package _07.stream.terminal;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class _10Average {
	 public static void main(String[] args) {
		 IntStream is =	IntStream.of(1,2,3,4,5,12);	
	     OptionalDouble od=is.average();
	     System.out.println(od.getAsDouble());
	     
	     }

}
