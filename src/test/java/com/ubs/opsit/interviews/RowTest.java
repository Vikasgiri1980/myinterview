package com.ubs.opsit.interviews;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RowTest {

    @Test
    public void testNoLamps() {
        final Row row = new Row(4, Color.YELLOW);

        assertEquals("0000", row.toString());
    }

    @Test
    public void testThreeYellowLamps() {
        final Row row = new Row(4, Color.YELLOW);
        row.turnOn(3);

        assertEquals("YYY0", row.toString());
    }

    @Test
    public void testThreeRedLamps() {
        final Row row = new Row(4, Color.RED);
        row.turnOn(3);

        assertEquals("RRR0", row.toString());
    }

    @Test
    public void testLampOverflow() {
        final Row row = new Row(4, Color.YELLOW);
        row.turnOn(4);

        assertEquals("YYYY", row.toString());

        row.turnOn(1);

        assertEquals("Y000", row.toString());
    }

    @Test
    public void testChangeColor() {
        final Row row = new Row(4, Color.YELLOW);
        row.turnOn(3);
        row.changeColor(Color.RED, 1,2);

        assertEquals("RRY0", row.toString());
    }

}
