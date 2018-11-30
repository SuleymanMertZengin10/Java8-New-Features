package _07.stream.terminal;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.IntStream;

public class _11IntSummaryStatistics {
	public static void main(String[] args) {
		Random r=new Random();
		IntStream is=IntStream.generate(r::nextInt).limit(10);
		IntSummaryStatistics isi= is.summaryStatistics();
		System.out.println(isi.getAverage());
		System.out.println(isi.getCount());
		System.out.println(isi.getMax());
		System.out.println(isi.getMin());
		System.out.println(isi.getSum());
		
		
	}

}
