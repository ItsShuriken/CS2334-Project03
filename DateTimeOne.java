import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DateTimeOne extends MesoDateTimeOneAbstract
{
	private static int second;
	private static HashMap<String, String> TIMEZONE_MAP;
	
	public DateTimeOne() {
		LocalDateTime ldt = LocalDateTime.now();
		second = ldt.getSecond();
	}

	
	/*
	 * Uses LocalDateTime to get current time then uses Date time formatter to 
	 * format to the desired style.
	 *
	 * returns a string.
	 */
	public void dateTimeNow() {
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
		
		System.out.println("Current Date/Time: " + ldt.format(formatter));
	}
	
	int getValueOfSecond() {
		System.out.println("The value of Second now: " + second);
		return second;
	}

	void sleepForFiveSec() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	/*
	 * Time on Server: 15:14
	 * GMT: 20:14
	 * BST (90E): 2:14
	 * CST (90W): 15:14
	 */
	void dateTimeOfOtherCity() {
		LocalDateTime ldt = LocalDateTime.now();
		ZonedDateTime GMT = ZonedDateTime.now(ZoneId.of("Etc/GMT-0"));
		ZonedDateTime BST = ZonedDateTime.now(ZoneId.of("Asia/Dhaka"));
		ZonedDateTime CST = ZonedDateTime.now(ZoneId.of("America/Chicago"));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

		System.out.println("Time on Server: " + ldt.format(formatter));
		System.out.println("GMT: " + GMT.format(formatter));
		System.out.println("BST (90E): " + BST.format(formatter));
		System.out.println("CST (90W): " + CST.format(formatter));	
	}

	void dateTimeDifferentZone() {
		ZonedDateTime GMT = ZonedDateTime.now(ZoneId.of("Etc/GMT-0"));
		ZonedDateTime BST = ZonedDateTime.now(ZoneId.of("Asia/Dhaka"));
		ZonedDateTime CST = ZonedDateTime.now(ZoneId.of("America/Chicago"));
		  
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
		
		TIMEZONE_MAP = new HashMap<>();		    	
		// populate Time Zone HashMap
		TIMEZONE_MAP.put("GMT", "GMT: " + GMT.format(formatter));
		TIMEZONE_MAP.put("BST", "BST: " + BST.format(formatter));
		TIMEZONE_MAP.put("CST", "CST: " + CST.format(formatter));
		
		for (String key: TIMEZONE_MAP.values())
			System.out.println(key);	
	}

	void timeZoneHashMap() {
		LocalDateTime ZST = LocalDateTime.of(2018, 11, 05, 19, 59);
		LocalDateTime AST = LocalDateTime.of(2020, 10, 01, 19, 59);
		ZonedDateTime GMT = ZonedDateTime.now(ZoneId.of("Etc/GMT-0"));
		ZonedDateTime BST = ZonedDateTime.now(ZoneId.of("Asia/Dhaka"));
		ZonedDateTime CST = ZonedDateTime.now(ZoneId.of("America/Chicago"));

		HashMap<String, String> TIMEZONE_MAP_STYLE_ONE = new HashMap<>();

		System.out.println("Print Style 1:");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
		TIMEZONE_MAP_STYLE_ONE.put("AST", "AST " + AST.format(formatter));
		TIMEZONE_MAP_STYLE_ONE.put("BST", "BST " + BST.format(formatter));
		TIMEZONE_MAP_STYLE_ONE.put("CST", "CST " + CST.format(formatter));
		TIMEZONE_MAP_STYLE_ONE.put("GMT", "GMT " + GMT.format(formatter));
		TIMEZONE_MAP_STYLE_ONE.put("ZST", "ZST " + ZST.format(formatter));
		
		for(Map.Entry<String, String> entry : TIMEZONE_MAP_STYLE_ONE.entrySet()) {
		    String value = entry.getValue();
		    
		    System.out.println(value);
		}
		
		System.out.println("\nPrint Style 3:");
		HashMap<String, String> TIMEZONE_MAP_STYLE_TWO = new HashMap<>();
		TIMEZONE_MAP_STYLE_TWO.put(TIMEZONE_MAP_STYLE_ONE.get("AST"),AST.format(formatter));
		TIMEZONE_MAP_STYLE_TWO.put(TIMEZONE_MAP_STYLE_ONE.get("BST"),BST.format(formatter));
		TIMEZONE_MAP_STYLE_TWO.put(TIMEZONE_MAP_STYLE_ONE.get("CST"),CST.format(formatter));
		TIMEZONE_MAP_STYLE_TWO.put(TIMEZONE_MAP_STYLE_ONE.get("GMT"),GMT.format(formatter));
		TIMEZONE_MAP_STYLE_TWO.put(TIMEZONE_MAP_STYLE_ONE.get("ZST"),ZST.format(formatter));
		
		for(Map.Entry<String, String> entry : TIMEZONE_MAP_STYLE_TWO.entrySet()) {
		    String value = entry.getValue();
		    
		    System.out.println(value);
		}
		
		
		
		
		
		
	}
   
}