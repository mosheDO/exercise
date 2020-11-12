package com.exercise;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleUtilsTest {
    
    @Test
    public void testCalculateLastLineOfColouredTriangle() {
      // assertEquals("expected", "actual");
      assertEquals('R', TriangleUtils.calculateLastLineOfColouredTriangle("GB"));
      assertEquals('R', TriangleUtils.calculateLastLineOfColouredTriangle("RRR"));
      assertEquals('B', TriangleUtils.calculateLastLineOfColouredTriangle("RGBG"));
      assertEquals('G', TriangleUtils.calculateLastLineOfColouredTriangle("RBRGBRB"));
      assertEquals('G', TriangleUtils.calculateLastLineOfColouredTriangle("RBRGBRBGGRRRBGBBBGG"));
      assertEquals('B', TriangleUtils.calculateLastLineOfColouredTriangle("B"));
    }
}
