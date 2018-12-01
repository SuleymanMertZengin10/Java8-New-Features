package _10.date_time_api;

import java.time.LocalDate;

public class _02LocalDate {
	public static void main(String[] args) {
		LocalDate localDate=LocalDate.ofYearDay(2018, 361);
		System.out.println(localDate);
		
		LocalDate epoch=LocalDate.ofEpochDay(1000);//1970 1 January 00.00.00.000
		System.out.println(epoch);
		
		LocalDate parsed=LocalDate.parse("2014-31-3");
	    System.out.println(parsed);
	}

}
