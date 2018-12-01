package _10.date_time_api;

import java.time.LocalDate;

public class _03LocalDate {
     public static void main(String[] args) {
		LocalDate localDate2=LocalDate.now();
		LocalDate afterPlus=localDate2.plusDays(12);//immutable olduğu için yeni bir obje oluştu
		System.out.println(localDate2);
		System.out.println(afterPlus);
		LocalDate lastDate= afterPlus.plusMonths(2).plusDays(12).plusWeeks(3).plusYears(12);
	    System.out.println(lastDate);
	    
		
	}

}
