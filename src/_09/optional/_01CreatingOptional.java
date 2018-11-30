package _09.optional;

import java.util.Optional;

public class _01CreatingOptional {
	public static void main(String[] args) {
		Optional<String> op=Optional.empty();
		
		System.out.println(op);
		
		Optional op2=Optional.of("SUleyman");
		System.out.println(op2.get());
		
		
//		Optional nullPointerException=Optional.of(null);
//		System.out.println(nullPointerException);
//      NullPointerException hatası döner		
		
		
		Optional nullable=Optional.ofNullable(null);
		System.out.println(nullable);
		//hata vermez empty döner
	
	}
}
