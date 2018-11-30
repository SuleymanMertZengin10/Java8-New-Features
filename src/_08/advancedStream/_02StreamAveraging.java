package _08.advancedStream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _02StreamAveraging {
	public static void main(String[] args) {
		Double d=Arrays.asList(12,3,4,5).stream().collect(Collectors.averagingDouble(x->x));
	    System.out.println(d);
	}

}
