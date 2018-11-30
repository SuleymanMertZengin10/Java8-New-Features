package _07.stream.terminal;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class _07Reduce {
	
	public static void main(String[] args) {
		String[] arrays=new String[] {"S","U","L","E","Y","M","A","N"};
		String result="";
		
		for(String s:arrays) {
			result=result+s;	
		}
		System.out.println("java 8 öncesi  : "+result);
		//java 8 kullanmadan döngü ile karekter karekter okuyabiliriz.
		
		Stream<String>names=Stream.of("S","U","L","E","Y","M","A","N");
		BinaryOperator<String>bo=(String str1,String str2)->str1+str2;
		Optional<String>opn=names.reduce(bo);
		//Optional<T> reduce(BinaryOperator<T> accumulator);
	    System.out.println("java 8 sonrasi : "+opn.get());		
	    
	    
	    
	    Stream<String>names2=Stream.of("M","E","R","T");
        String reduced=names2.reduce("#",bo);
	    System.out.println(reduced);
	    
	    
	    BinaryOperator<String>bo2=String::concat;
	    
	    
	    
	    
		
	}

}
