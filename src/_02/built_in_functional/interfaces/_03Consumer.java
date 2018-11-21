package _02.built_in_functional.interfaces;

import java.util.function.Consumer;

public class _03Consumer {
	public static void main(String[] args) {
		Consumer<String>toLowerCase=str->System.out.println(str.toLowerCase());
		
		toLowerCase.accept("SULEYMAN");
		
	}

}

