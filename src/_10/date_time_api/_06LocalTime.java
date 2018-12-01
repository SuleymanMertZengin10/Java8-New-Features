package _10.date_time_api;

import java.time.LocalTime;

public class _06LocalTime {
	 
	public static void main(String[] args) {
	  LocalTime localTime=LocalTime.now();
	  System.out.println(localTime);
	  LocalTime localTimeafterPlus=localTime.plusMinutes(12).plusHours(2);
	  System.out.println(localTimeafterPlus);
	  
		
	}

}
