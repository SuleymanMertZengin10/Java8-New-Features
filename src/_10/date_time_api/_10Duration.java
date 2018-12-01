package _10.date_time_api;

import java.time.Duration;
import java.time.LocalTime;

public class _10Duration {
	public static void main(String[] args) {
		LocalTime  localTime=LocalTime.of(12, 32);
		LocalTime now=LocalTime.now();
		Duration d=Duration.between(localTime, now);
		System.out.println(d);

		//PT3H33M26.082S
	}

}
