package _09.optional;

import java.util.Optional;

public class _03Test {
	public static void main(String[] args) {
		Optional<String>op=Optional.empty();
		//
		
		System.out.println(op.map(String::length).orElse(-1));
		
		System.out.println(op.map(String::length).orElseThrow(RuntimeException::new));
		
		
	}

}
