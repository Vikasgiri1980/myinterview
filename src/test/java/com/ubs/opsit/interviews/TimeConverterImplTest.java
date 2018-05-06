package com.ubs.opsit.interviews;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeConverterImplTest {

	 private TimeConverter berlinClock;
	
	 @Test
	  public void timeConverter() {
		 	berlinClock = new TimeConverterImpl();
	        assertEquals("Y\r\n" + 
	        		"RRRR\r\n" + 
	        		"RRRR\r\n" + 
	        		"OOOOOOOOOOO\r\n" + 
	        		"OOOO", berlinClock.convertTime("24:00:00"));
	   }
}
