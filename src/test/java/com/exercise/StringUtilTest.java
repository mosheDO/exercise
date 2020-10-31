package com.exercise;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// import org.junit.Assert.assertEquals;
// import org.junit.runners.JUnit4;
import java.util.Arrays;


public class StringUtilTest {

    //#region StringSplit
    @Test
    public void testEvenStringStringSplit() {
       String s = "abcdef";
       String s1 = "HelloWorld";
       assertEquals("Should handle even string","[ab, cd, ef]", Arrays.toString(StringUtil.StringSplit(s)));
       assertEquals("Should handle even string","[He, ll, oW, or, ld]", Arrays.toString(StringUtil.StringSplit(s1)));
    }
    
    @Test
    public void testOddStringStringSplit() {
       String s = "abcde";
       String s1 = "LovePizza";
       assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(StringUtil.StringSplit(s)));
       assertEquals("Should handle odd string","[Lo, ve, Pi, zz, a_]", Arrays.toString(StringUtil.StringSplit(s1)));
    }

    //#endregion StringSplit
}
