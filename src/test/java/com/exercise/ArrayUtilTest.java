package com.exercise;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayUtilTest {


    //#region isArrayBExponentiationOfTwoOfArrayA
    @Test
    public void testIsArrayBExponentiationOfTwoOfArrayATrue() {
        int[] a = new int[] { 121, 144, 19, 161, 19, 144, 19, 11 };
        int[] b = new int[] { 121, 14641, 20736, 361, 25921, 361, 20736, 361 };
        assertEquals(true, ArrayUtil.isArrayBExponentiationOfTwoOfArrayA(a, b));
    }

    @Test
    public void testIsArrayBExponentiationOfTwoOfArrayAFalse() {
        int[] a = new int[] { 121, 144, 19, 161, 19, 144, 19, 11 };
        int[] b = new int[] { 132, 14641, 20736, 361, 25921, 361, 20736, 361 };

        assertEquals(true, ArrayUtil.isArrayBExponentiationOfTwoOfArrayA(a, b));
    }

    @Test
    public void testIsArrayBExponentiationOfTwoOfArrayANotValidNull() {
        int[] a = new int[] { 121, 144, 19, 161, 19, 144, 19, 11 };

        assertEquals(false, ArrayUtil.isArrayBExponentiationOfTwoOfArrayA(a, null));
    }

    @Test
    public void testIsArrayBExponentiationOfTwoOfArrayANotValidLength() {
        int[] a = new int[] { 121, 144, 19, 161, 19, 144, 19, 11 };
        int[] b = new int[] { 132, 14641, 20736, 361, 25921, 361, 20736 };

        assertEquals(false, ArrayUtil.isArrayBExponentiationOfTwoOfArrayA(a, b));
    }

    //#endregion isArrayBExponentiationOfTwoOfArrayA


    //#region findIndexForEvenBothSides

    @Test
    public void testFindIndexForEvenBothSides() {
       assertEquals(3, ArrayUtil.findIndexForEvenBothSides(new int[] {1,2,3,4,3,2,1}));
       assertEquals(1, ArrayUtil.findIndexForEvenBothSides(new int[] {1,100,50,-51,1,1}));
       assertEquals(-1, ArrayUtil.findIndexForEvenBothSides(new int[] {1,2,3,4,5,6}));
       assertEquals(3, ArrayUtil.findIndexForEvenBothSides(new int[] {20,10,30,10,10,15,35}));
       assertEquals(-1, ArrayUtil.findIndexForEvenBothSides(new int[] {-8505, -5130, 1926, -9026}));
       assertEquals(1, ArrayUtil.findIndexForEvenBothSides(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
       assertEquals(6, ArrayUtil.findIndexForEvenBothSides(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
   }
    //#endregion findIndexForEvenBothSides

   @Test
    public void testRotrateArrayToLeftByNUmber() {
        assertArrayEquals(new int[] {5, 1, 2, 3, 4}, ArrayUtil.rotrateArrayToLeftByNUmber(new int[] {1, 2, 3, 4, 5}, 4));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, ArrayUtil.rotrateArrayToLeftByNUmber(new int[] {1, 2, 3, 4, 5}, 0));
        assertArrayEquals(new int[] {2, 3, 4, 5, 1}, ArrayUtil.rotrateArrayToLeftByNUmber(new int[] {1, 2, 3, 4, 5}, 1));
        assertArrayEquals(new int[] {}, ArrayUtil.rotrateArrayToLeftByNUmber(new int[] {}, 0));
    }
}
