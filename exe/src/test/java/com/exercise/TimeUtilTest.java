package com.exercise;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TimeUtilTest {

    @Test
    public void testTimeToMilliscenods() {
      
        assertEquals(Long.valueOf(61000), TimeUtil.timeToMilliscenods(0, 1, 1));
        assertEquals(Long.valueOf(0), TimeUtil.timeToMilliscenods(0, 0, 0));
        assertEquals(Long.valueOf(3600000), TimeUtil.timeToMilliscenods(1, 0, 0));
        assertEquals(Long.valueOf(60000), TimeUtil.timeToMilliscenods(0, 1, 0));
        assertEquals(Long.valueOf(1000), TimeUtil.timeToMilliscenods(0, 0, 1));
        assertEquals(Long.valueOf(-1), TimeUtil.timeToMilliscenods(0, 0, -1));
   }
}
