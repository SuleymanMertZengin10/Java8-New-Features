package _12.instant;

import java.time.Instant;
import java.time.LocalDateTime;

public class _01Instant {
	public static void main(String[] args) {
		Instant instant=Instant.now();
		System.out.println(instant);
		//2018-11-30T12:38:46.848Z
		//+3 ü dikkate almadan veriyor
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		//2018-11-30T15:39:42.347
		
	}

}
