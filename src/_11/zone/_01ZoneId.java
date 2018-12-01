package _11.zone;

import java.time.ZoneId;
import java.util.Set;

public class _01ZoneId {

	public static void main(String[] args) {
	 ZoneId zone=ZoneId.systemDefault();
	 System.out.println(zone);
	 Set<String>zoneId=ZoneId.getAvailableZoneIds();
	 long count=zoneId.stream().peek(s-> System.out.println(s)).count();
	 System.out.println(count);

	}
}
