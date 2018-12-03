package _15.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class _09Stream {
	public static void main(String[] args) throws IOException {
		
		try(Stream<Path>stream=Files.walk(Paths.get("."),1)){
			//1 derinlik anlamına gelir
			stream.forEach(a->System.out.println(a.getFileName()));
		}
				
	}

}
