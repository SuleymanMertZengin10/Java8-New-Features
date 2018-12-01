package _10.date_time_api;

import java.time.LocalDate;
import java.time.Period;

public class _08Period {

	public static void main(String[] args) {
		LocalDate startDate=LocalDate.of(1996, 02, 25);
		LocalDate now=LocalDate.now();
		Period period=Period.between(startDate,now);
	    System.out.println(period);
	    
	    //P6Y9M9D
	    //6 yıl 9 ay 9 gün lük bir period var 
	    System.out.println(period.getDays());	    
	     
	}
}
