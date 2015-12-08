package com.tw;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {

    @Test
    public void testLengthEqual() {
        Length oneLength = new Length(1, "m");
        Length otherLength = new Length(1000, "mm");

        assertTrue(oneLength.equals(otherLength));
    }

    @Test
    public void testMultiply() {
        Length oneLength = new Length(1, "m");

        assertTrue(oneLength.multiply(2).equals(new Length(2000, "mm")));
    }

    @Test
    public void testDivide() {
        Length oneLength = new Length(1, "m");

        assertTrue(oneLength.divide(2).equals(new Length(500, "mm")));
    }

    @Test
    public void testGetMMLength() {
        Length oneLength = new Length(2, "m");

        assertTrue(oneLength.getMMLength().equals(new Length(2000, "mm")));
    }

    @Test
    public void testGetCMLength() {
        Length oneLength = new Length(2, "m");

        assertTrue(oneLength.getCMLength().equals(new Length(200, "cm")));
    }

    @Test
    public void testGetMLength() {
        Length oneLength = new Length(2000, "mm");

        assertTrue(oneLength.getMLength().equals(new Length(2, "m")));
    }

    @Test
    public void testAdd() {
        Length oneLength = new Length(2000, "mm");
        Length otherLength = new Length(15, "m");

        assertTrue(oneLength.add(otherLength).equals(new Length(17, "m")));
    }

    @Test
    public void testSubtract() {
        Length oneLength = new Length(200, "mm");
        Length otherLength = new Length(1, "cm");

        assertTrue(oneLength.subtract(otherLength).equals(new Length(190, "mm")));
    }
}