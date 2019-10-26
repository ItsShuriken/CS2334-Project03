import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;

public class DateTimeTwo {

	HashMap<LocalDate, Integer> DATES = new HashMap<>();
	int hashes = 1;
	Boolean isLeapYear;
	
	public DateTimeTwo() {
		
	}
	
	public void daysOfCurrentMonth() {
		final int FIRST_DAY_TO_GET = 10;
		final int SECOND_DAY_TO_GET = 18;
		String[] days = new String[] 
				{ "", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };

		//get current time
		Calendar cal = Calendar.getInstance();
		
		//set day to one we want to find and keep rest the same
		cal.set(Calendar.DAY_OF_MONTH, FIRST_DAY_TO_GET);
		int tenthDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		cal.set(Calendar.DAY_OF_MONTH, SECOND_DAY_TO_GET);
		int eighteenthDayOFWeek = cal.get(Calendar.DAY_OF_WEEK);

		//print out the string and convert from int value to string value for the day of week.
		System.out.println(
				String.format("The tenth day of this month is %s and eighteenth is %s", 
						days[tenthDayOfWeek], days[eighteenthDayOFWeek]));
	}
	//find 15th and last day of month
	public void daysOfAnyMonth(int month, int year) {
		final int DAY_TO_GET = 15;
		int fifteenthDay;
		int lastDay;
		String[] days = new String[] 
				{ "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
		
		YearMonth YM = YearMonth.of(year, month);
		LocalDate fifteenth = YM.atDay(DAY_TO_GET);
		fifteenthDay = fifteenth.getDayOfWeek().getValue();
		
		LocalDate EOM = YM.atEndOfMonth();
		lastDay = EOM.getDayOfWeek().getValue();	
		
		System.out.println(String.format("For the year (%d) and month (%d), the fifteenth day is %s and the last day is %s", 
				year, month, days[fifteenthDay], days[lastDay]));
	}
	
	
	public void compareYear() throws IOException {
		readFile();
		
		
	}
	public void dateHashMapSorted() {
		// TODO Auto-generated method stub
		
	}

	public void dateHashMap() {
		// TODO Auto-generated method stub
		
	}

	private void readFile() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Dates.txt"));
		String[] line;
		//reads through each line passing it to addToArray, stopping if line is NULL
		String strg = br.readLine();
		while (strg != null) {	
			line = strg.split(".");
			strg = br.readLine();
		}
		br.close();
	}
	private void addToHash(String[] line) {
		DATES.put(LocalDate.of
				(
						Integer.parseInt(line[2]), 
						Integer.parseInt(line[0]), 
						Integer.parseInt(line[1])
				), hashes);
		hashes++;
	}

}
