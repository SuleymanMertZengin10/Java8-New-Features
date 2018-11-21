package _03.primitiveVersionOfBuilt_in_function;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class _03PrimitiveConsumer {

	public static void main(String[] args) {
		IntConsumer ic=System.out::println;
		IntStream.of(1,2,3,4,5).forEach(ic);
		}
}
