import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MesoEquivalent {

	private static final int LINES_TO_SKIP = 3;
	private String stID;
	HashMap<String, Integer> asciiVal = new HashMap<String, Integer>();
	public MesoEquivalent(String stId) throws IOException {
		this.stID = stId;
		readFile();

	}
	public HashMap<String, Integer> calAsciiEqual() {
		HashMap<String, Integer> equalAscii = new HashMap<String, Integer>();
		
		for(Map.Entry<String, Integer> entry : asciiVal.entrySet()) {
		    String key = entry.getKey();
		    Integer value = entry.getValue();
		    
		    if (value == calAvg("NRMN")) {
		    	equalAscii.put(key, value);
		    }
		}
		return equalAscii;
	}
	private int calAvg(String stid) {
		char[] charSTID = stid.toCharArray();
		double total = 0;
		for (int i = 0; i <4; i++) {
			total += charSTID[i];
		}	
		int finalAvg = (int) Math.ceil(total /4);
		
		return finalAvg;
	}	
	private void readFile() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Gunter\\eclipse-workspace\\Project03\\src\\Mesonet.txt"));

		//skips through first 3 junk lines
		for(int i = 0; i < LINES_TO_SKIP; i++) {
			br.readLine();
		}
		String strg = br.readLine();
		while (strg != null) {	
			addToHash(strg);
			strg = br.readLine();
		}
		br.close();
	}
	private void addToHash(String strg) {
		String line = strg;
		line = line.replaceAll("\\s", "");
		line = line.replaceAll("\t", "");
		line = line.substring(0, 4);
		
		
		asciiVal.put(line, calAvg(line));
	}
}
