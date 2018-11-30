package _07.stream.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class _03MinMaxPrimitive {
	public static void main(String[] args) {
		IntStream is=IntStream.of(1,2,3,4,5);
        OptionalInt oi=is.min();
        System.out.println(oi.getAsInt());
        
        
		IntStream is2=IntStream.of(112,12,1312,412,512);
        OptionalInt oi2=is2.max();
        System.out.println(oi2.getAsInt());
	
	}

}
