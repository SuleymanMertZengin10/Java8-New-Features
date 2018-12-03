package _15.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _03Files {
	public static void main(String[] args) throws IOException {
      Path path1=Paths.get("test312.txt");
      
      
      if(!Files.exists(path1)) {
    	  Files.createFile(path1);
      }
      System.out.println(path1);
      
      Path path2=Paths.get("folder/folder2");
      if(!Files.exists(path2)) {
    	  Files.createDirectories(path2);
      }

     
      

	}

}
