package _10.date_time_api;

import java.time.LocalDate;
import java.time.Period;

public class _09Period {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		Period p=Period.of(2, 12, 21);
		System.out.println(ld);
		LocalDate newLocal=ld.plus(p);
		System.out.println(newLocal);
		
		//Period objelerini Date ile ilişklendirdik fakat Time ile ilişkilendiremeyiz
		//derleme hatası vermez ama calısma zamandında hata verir
		
		
	}
}
