import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DateSortingUsingAlgorithm {

	private HashMap<LocalDate, Integer> DATES = new HashMap<LocalDate, Integer>();
	public void dateHashMapSortedDescending() throws IOException {
		readFile();
		
		List<LocalDate> LDA = new ArrayList<LocalDate>();
		LDA.addAll(DATES.keySet());
		Collections.sort(LDA, Collections.reverseOrder());
		
		for (LocalDate a: LDA) {
			System.out.println(a);
		}
	}

	public void dateHashMapSorted() {
		List<LocalDate> LDA = new ArrayList<LocalDate>();
		LDA.addAll(DATES.keySet());
		Collections.sort(LDA);
		
		for (LocalDate a: LDA) {
			System.out.println(a);
		}
		
		
	}
	
	private void readFile() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Gunter\\eclipse-workspace\\Project03\\src\\SortingDates.txt"));

		String strg = br.readLine();
		while (strg != null) {	
			addToHash(strg);
			strg = br.readLine();
		}
		br.close();
	}
	private void addToHash(String strg) {
		String line = strg;
		String[] lineSplit;
		line = line.replaceAll("\\s", "");
		line = line.replaceAll("\t", "");
		lineSplit = line.split("-");
		int count = 0;
		
		DATES.put(LocalDate.of(Integer.parseInt(lineSplit[0]), Integer.parseInt(lineSplit[1]), Integer.parseInt(lineSplit[2])), count);
		
		count++;
		
	}

}
