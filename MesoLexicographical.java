import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MesoLexicographical extends MesoSortedAbstract
{
	
	private LinkedHashMap<String, Integer> LHM = new LinkedHashMap<String, Integer>();
	public MesoLexicographical(HashMap<String, Integer> asciiVal) {
		sortedMap(asciiVal);
	}

	@Override
	Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) {
		List<String> list = new ArrayList<String>(unsorted.size());
		list.addAll(unsorted.keySet());
		Collections.sort(list);
		
		for (String a: list) {
			System.out.println(a + " " + unsorted.get(a));
		}
		Collections.sort(list);

		
		
		return null;
	}

	

}