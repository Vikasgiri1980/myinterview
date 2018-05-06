package com.ubs.opsit.interviews;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerlinClockTest {

    private BerlinClock berlinClock;

    @Before
    public void setUp() {
        berlinClock = new BerlinClock();
    }


    @Test
    public void testEvenSeconds() {
        berlinClock.setSeconds(2);

        assertEquals("Y", berlinClock.getSecondsLamp().toString());
    }

    @Test
    public void testOddSeconds() {
        berlinClock.setSeconds(3);

        assertEquals("O", berlinClock.getSecondsLamp().toString());
    }

    @Test
    public void testFiveHoursRow() {
        berlinClock.setHours(15);

        assertEquals("RRRO", berlinClock.getFiveHoursRow().toString());
    }

    @Test
    public void testOneHourRow() {
        berlinClock.setHours(2);

        assertEquals("RROO", berlinClock.getOneHourRow().toString());
    }

    @Test
    public void testFiveMinutesRow() {
        berlinClock.setMinutes(20);

        assertEquals("YYRYOOOOOOO", berlinClock.getFiveMinutesRow().toString());
    }

    @Test
    public void testOneMinuteRow() {
        berlinClock.setMinutes(2);

        assertEquals("YYOO", berlinClock.getOneMinuteRow().toString());
    }

    @Test
    public void testOneOclock() {
        berlinClock.setHours(1);

        assertEquals("ROOO", berlinClock.getOneHourRow().toString());
    }

    @Test
    public void testThreeOclock() {
        berlinClock.setHours(3);

        assertEquals("RRRO", berlinClock.getOneHourRow().toString());
    }

    @Test
    public void testFiveOclock() {
        berlinClock.setHours(5);

        assertEquals("ROOO", berlinClock.getFiveHoursRow().toString());
    }

    @Test
    public void testSevenOclock() {
        berlinClock.setHours(7);

        assertEquals("ROOO", berlinClock.getFiveHoursRow().toString());
        assertEquals("RROO", berlinClock.getOneHourRow().toString());
    }

    @Test
    public void testAQuarterPastNine() {
        berlinClock.setHours(9).setMinutes(15);

        assertEquals("ROOO", berlinClock.getFiveHoursRow().toString());
        assertEquals("RRRR", berlinClock.getOneHourRow().toString());
        assertEquals("YYROOOOOOOO", berlinClock.getFiveMinutesRow().toString());
    }

    @Test
    public void testSeventeenPastEleven() {
        berlinClock.setHours(11).setMinutes(17);

        assertEquals("RROO", berlinClock.getFiveHoursRow().toString());
        assertEquals("ROOO", berlinClock.getOneHourRow().toString());
        assertEquals("YYROOOOOOOO", berlinClock.getFiveMinutesRow().toString());
        assertEquals("YYOO", berlinClock.getOneMinuteRow().toString());
    }

    @Test
    public void testNewHour() {
        berlinClock.setHours(11).setMinutes(59);

        assertEquals("RROO", berlinClock.getFiveHoursRow().toString());
        assertEquals("ROOO", berlinClock.getOneHourRow().toString());
        assertEquals("YYRYYRYYRYY", berlinClock.getFiveMinutesRow().toString());
        assertEquals("YYYY", berlinClock.getOneMinuteRow().toString());

        berlinClock.setHours(12).setMinutes(0);
        assertEquals("RROO", berlinClock.getFiveHoursRow().toString());
        assertEquals("RROO", berlinClock.getOneHourRow().toString());
        assertEquals("OOOOOOOOOOO", berlinClock.getFiveMinutesRow().toString());
        assertEquals("OOOO", berlinClock.getOneMinuteRow().toString());

    }

}
