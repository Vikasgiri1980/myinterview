package com.ubs.opsit.interviews;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TimeConverterImpl  implements TimeConverter{

	public static String TIME_FORMAT = "\\d\\d:\\d\\d:\\d\\d";
	public static String NEW_LINE = "\r\n";
	
	private static BerlinClock berlinClock;
	
	
	@Override
	public String convertTime(String aTime) {
		// TODO Auto-generated method stub
		
		 if (!aTime.matches(TIME_FORMAT)) {
	            throw new IllegalArgumentException("Input should  be in the format HH:MM:SS ::  " + aTime);
	        }

		   List<Integer> parts = Stream.of(aTime.split(":")).map(Integer::valueOf).collect(Collectors.toList());
	       berlinClock = new BerlinClock();
	       berlinClock.setHours(parts.get(0));
	       berlinClock.setMinutes(parts.get(1));
	       berlinClock.setSeconds(parts.get(2));
	       
	       return new  StringBuilder().append(berlinClock.getSecondsLamp()).append(NEW_LINE).
	        		append(berlinClock.getFiveHoursRow()).append(NEW_LINE).
	        		append(berlinClock.getOneHourRow()).append(NEW_LINE).
	        		append(berlinClock.getFiveMinutesRow()).append(NEW_LINE)
	        		.append(berlinClock.getOneMinuteRow())
	        		.toString();
	   
		
	}
	
}
