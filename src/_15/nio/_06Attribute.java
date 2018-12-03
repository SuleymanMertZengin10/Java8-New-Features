package _15.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _06Attribute {
	public static void main(String[] args) throws IOException {
		Path p1=Paths.get("folder");
	    System.out.println(Files.isDirectory(p1));
	    System.out.println(Files.isRegularFile(p1));
	    System.out.println(Files.isExecutable(p1));
	    System.out.println(Files.isWritable(p1));
        System.out.println(Files.isHidden(p1));
        
        Path p2=Paths.get("buffered.txt");
        System.out.println(Files.size(p2));
        System.out.println(Files.getLastModifiedTime(p1));
        
        System.out.println(Files.getOwner(p2));
	}

}
