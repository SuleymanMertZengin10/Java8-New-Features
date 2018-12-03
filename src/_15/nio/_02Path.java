package _15.nio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _02Path {
	public static void main(String[] args) {
		Path path=Paths.get("/folder/folder1/text.txt");
		System.out.println(path.getFileName());
     	System.out.println(path.getRoot());
    	System.out.println(path.getParent());
    	System.out.println(path.getNameCount());
    	System.out.println(path.getName(2));// 0 dan başlar 
    	System.out.println(path.isAbsolute());
    	System.out.println(path.subpath(0,3));
        System.out.println(path.getFileSystem());     
        
        File file=path.toFile();
	    Path p2= file.toPath();
	    
	    
	}

}

//path : absulate ve relative olabilir

//unix sitemler için apth :/ ile başlar 
//windows da c:\\ d:\\seklinde olabilir
