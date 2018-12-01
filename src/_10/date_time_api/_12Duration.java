package _10.date_time_api;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class _12Duration {
public static void main(String[] args) {
	System.out.println(Duration.of(1, ChronoUnit.MINUTES).getSeconds());
}
}
