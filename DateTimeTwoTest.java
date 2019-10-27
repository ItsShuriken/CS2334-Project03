import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DateTimeTwoTest {

	@Test
	void DaysOfAnyMonthtest() {
	    DateTimeTwo dateTimeTwo = new DateTimeTwo();
	    
	    String expected = "For the year (2019) and month (10), the fifteenth day is TUESDAY and the last day is THURSDAY";
	    Assert.assertEquals(expected, dateTimeTwo.daysOfAnyMonth(10, 2019));
	    
	}

}
