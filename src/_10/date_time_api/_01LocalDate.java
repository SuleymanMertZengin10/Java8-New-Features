package _10.date_time_api;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class _01LocalDate {
	
	public static void main(String[] args) {
		Date date=new Date();
		//LocalDate l=new _LocalDate();
		//bu legal değildir.constructori private
		LocalDate localDate=LocalDate.now();	
		System.out.println(date);
		System.out.println("-------");
		System.out.println(localDate);//sadece gün- ay -yıl
		
		LocalDate localDate2=LocalDate.of(2015, 4, 21);
		LocalDate localDate3=LocalDate.of(2015, Month.FEBRUARY, 12);
		
		System.out.println(localDate2);
		System.out.println(localDate3);
		
	}

}
