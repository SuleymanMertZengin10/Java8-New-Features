package _15.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _05Write {
	public static void main(String[] args) throws IOException {
		Path p1=Paths.get("buffered.txt");
		
		try(BufferedWriter bw=Files.newBufferedWriter(p1)){
			bw.write("suleyman zengin");
			
		}

		
		try(BufferedReader br=Files.newBufferedReader(p1)){
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}
	}
	

}
