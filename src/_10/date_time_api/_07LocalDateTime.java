package _10.date_time_api;

import java.time.LocalDateTime;

public class _07LocalDateTime {
	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDateTime max=LocalDateTime.MAX;
		LocalDateTime min=LocalDateTime.MAX;
		System.out.println(min);
		
	}

}
