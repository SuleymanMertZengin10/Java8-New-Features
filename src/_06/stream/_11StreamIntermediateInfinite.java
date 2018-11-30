package _06.stream;

import java.util.stream.Stream;

public class _11StreamIntermediateInfinite {
  
	public static void main(String[] args) {   
		
  Stream.generate(()->"Sleyman").sorted().forEach(System.out::println);
   //OutOfMemoryError hatası verir 
	//sonsuz bir datayı sort etmeye calısıyoruz bu yanlıs limit deyip daha
    //sonra sort etmek daha güzel olacaktır

  Stream.generate(()->"Sleyman").limit(2).sorted().forEach(System.out::println);
   	
		
  }
}
