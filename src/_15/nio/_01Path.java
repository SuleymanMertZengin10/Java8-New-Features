package _15.nio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _01Path {
	public static void main(String[] args) { 
		File file=new File("text.txt");
		//burada sadece file objesi olusur yen dosya lusmaz.Aynısı path içinde geçerli
		Path path=Paths.get("text.txt");
		System.out.println(path.getClass());
          
		
	}

}
//java.nio.file.Path; ->interface,eski java.io.File sınıfına karsılık gelen bir interface 
//java 1.7 ile gelen bir özellik /interface
//nio için entry point  intreface 


