package _10.date_time_api;

import java.time.LocalTime;

public class _04LocalTime {
	public static void main(String[] args) {
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		LocalTime localTime2=LocalTime.of(20, 12);
		LocalTime localTime3=LocalTime.of(20, 12,12);
		LocalTime localTime4=LocalTime.of(20, 12,12,12);
		
		System.out.println(localTime2);
		System.out.println(localTime3);
		System.out.println(localTime4);
		
		
	}

}
