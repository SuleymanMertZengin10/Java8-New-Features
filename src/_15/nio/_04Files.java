package _15.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _04Files {
	public static void main(String[] args) throws IOException {
		Path p1=Paths.get("deneme1.txt");
		Path p2=Paths.get("deneme1.txt");
		if(!Files.exists(p1)) {
			Files.createFile(p1);	
		}
		if(!Files.exists(p2)) {
			Files.createFile(p2);
		}
		
		
		
		System.out.println(Files.isSameFile(p1, p2));
		
	}

}
