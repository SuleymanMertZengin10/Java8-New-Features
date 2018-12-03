package _15.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class _11Stream {

	public static void main(String[] args) throws IOException {
		try(Stream<String> stream=Files.lines(Paths.get("buffered.txt"))){
			
			stream.forEach(System.out::println);
		}
		
	}
}
