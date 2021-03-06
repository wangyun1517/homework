package com.tw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaximeterTest {

    private Taximeter meter;

    @Before
    public void setUp() throws Exception {
        meter = new Taximeter();
    }

    @Test
    public void testCalculateByDistance() throws Exception {
        double origin = 1500;
        assertEquals(6, meter.calculateByDistance(origin), 0);
        origin += 1000;
        assertEquals(6.4, meter.calculateByDistance(origin), 0);
        origin += 8000;
        assertEquals(13.8, meter.calculateByDistance(origin), 0);
    }

    @Test
    public void testCalculateByTime() throws Exception {
        assertEquals(1, meter.calculateByTime(4), 0);
    }

    @Test
    public void testGetRoundingResult() throws Exception {
        double x = 5.2;
        assertEquals(5, meter.getRoundingResult(x), 0);
        x += 0.5;
        assertEquals(6, meter.getRoundingResult(x), 0);
    }

    @Test
    public void testGetFinalCharge() throws Exception {
        assertEquals(15, meter.getFinalCharge(10500, 4), 0);
    }
}