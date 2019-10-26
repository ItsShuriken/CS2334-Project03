import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class DateTimeOneTest {

	@SuppressWarnings("deprecation")
	@Test
	void testGetValueOfSecond() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeOne One = new DateTimeOne();
		int expected = now.getSecond();
		int actual = One.getValueOfSecond();
		Assert.assertEquals(expected, actual);
	}

	@Test
	void testDateTimeNow() {
		fail("Not yet implemented");
	}

	@Test
	void testSleepForFiveSec() {
		fail("Not yet implemented");
	}

	@Test
	void testDateTimeOfOtherCity() {
		fail("Not yet implemented");
	}

	@Test
	void testDateTimeDifferentZone() {
		fail("Not yet implemented");
	}

	@Test
	void testTimeZoneHashMap() {
		fail("Not yet implemented");
	}

	@Test
	void testDateTimeOne() {
		fail("Not yet implemented");
	}

}
