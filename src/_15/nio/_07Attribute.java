package _15.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class _07Attribute {
	
	public static void main(String[] args) throws IOException {
		Path p1=Paths.get("buffered.txt");
		BasicFileAttributes bfa=Files.readAttributes(p1,BasicFileAttributes.class);
		
		System.out.println(bfa.creationTime());
		System.out.println(bfa.isDirectory());
		System.out.println(bfa.isRegularFile());
		System.out.println(bfa.lastAccessTime());
		
		
		
		
	}

}
