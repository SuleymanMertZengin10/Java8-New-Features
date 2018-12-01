package _10.date_time_api;

import java.time.LocalTime;

public class _05LocalTime {
	public static void main(String[] args) {
		LocalTime parsed=LocalTime.parse("21:12");
		LocalTime parsed2=LocalTime.parse("21:12:21");
		System.out.println(parsed);
		System.out.println(parsed2);

	}

}
