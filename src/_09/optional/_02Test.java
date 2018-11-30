package _09.optional;

import java.util.Optional;

public class _02Test {
	public static void main(String[] args) {
		Optional<String>op=Optional.of("Zengin");
		
		boolean b=op.isPresent();
		//eğer değer varsa true döner null is veya empty ise false döner 
		System.out.println(b);
		op.ifPresent(System.out::println);

		if(op.isPresent()) {
			System.out.println(op.get());
		}
		//üstekiyle aynı  anlamda
		
		
	
	}
	
}
