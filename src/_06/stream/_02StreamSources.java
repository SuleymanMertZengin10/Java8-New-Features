package _06.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _02StreamSources {
	public static void main(String[] args) {
		
		IntStream intSt=Arrays.stream(new int[] {1,2,3,4,5});
		Stream<Integer> iSt2=Arrays.stream(new Integer[] {1,2,3,4,5});
	}

}
