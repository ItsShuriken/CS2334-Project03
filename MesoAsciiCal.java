
public class MesoAsciiCal extends MesoAsciiAbstract 
{

	private String stID;
	private final String fixedSTID = "NRMN";
	//For MesoAsciiCal, for calAverage, you’re returning the average of two ascii averages: the MesoStation code parameter, and “NRMN”.
	
	//I dont think i need this in the end but i do to run the program
	public MesoAsciiCal(MesoStation mesoStation) {
		this.stID = mesoStation.getStID();
	
	
	}

	@Override
	int calAverage() {
		char[] charSTID = stID.toCharArray();
		char[] charSTIDFixed = fixedSTID.toCharArray();
		double totalstid = 0;
		double totalFixed = 0;
		double finalAvg = 0;
		
		for (int i = 0; i < 4; i++) 
			totalstid += (int)charSTID[i];
		for (int i = 0; i < 4; i++) 	
			totalFixed += (int)charSTIDFixed[i];
		
		finalAvg = Math.ceil(((totalstid / 4) + (totalFixed / 4)) /2);
		
		return (int) finalAvg;
	}
   
}